package com.techelevator.dao;

import com.techelevator.model.Customer;
import com.techelevator.model.Sale;
import com.techelevator.model.Size;
import com.techelevator.model.Topping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcSizeDao implements SizeDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcSizeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Size getSizeById(String sizeId){
        Size size = new Size();
        String sql = "SELECT size_id, size_description, diameter, base_price " +
                " FROM size WHERE size.size_id = ? ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, sizeId);
        if(results.next()) {
            size = mapRowToSize(results);
        }
        return size;
    }

    @Override
    public List<Size> getAllSizes(){
        List<Size> sizeList = new ArrayList<>();
        String sql = "SELECT size_id, size_description, diameter, base_price " +
                " FROM size ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Size size = mapRowToSize(results);
            sizeList.add(size);
        }
        return sizeList;
    }

    @Override
    public Size createSize(Size newSize) {
        String sql = "INSERT INTO size (size_id, size_description, diameter, base_price) " +
                "values(?, ?, ?, ?) RETURNING size_id;";
        String newId = jdbcTemplate.queryForObject(sql, String.class, newSize.getSizeId(), newSize.getSizeDescription(), newSize.getDiameter(), newSize.getBasePrice());
        return getSizeById(newId);
    }

    @Override
    public void updateSize(Size size, String sizeId) {
        String sql = "UPDATE size SET " +
                "size_id = ?, size_description = ?, diameter = ?, base_price = ? " +
                "WHERE (size_id) = ?;";
        jdbcTemplate.update(sql, size.getSizeId(), size.getSizeDescription(), size.getDiameter(), size.getBasePrice(), sizeId);

    }

    @Override
    public void deleteSize(String id){
        String sql = "DELETE FROM size WHERE size.size_id = ?";
        jdbcTemplate.update(sql, id);
    }

    public Size mapRowToSize(SqlRowSet rowSet){
        try {
            return new Size(rowSet.getString("size_id"),
                    rowSet.getString("size_description"),
                    rowSet.getInt("diameter"),
                    rowSet.getBigDecimal("base_price"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
