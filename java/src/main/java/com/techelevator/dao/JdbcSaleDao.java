package com.techelevator.dao;
import com.techelevator.model.Employee;
import com.techelevator.model.Pizza;
import com.techelevator.model.Sale;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcSaleDao implements SaleDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcSaleDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Sale getSaleById(int saleId){
        Sale sale = new Sale();
        String sql  = "SELECT sale_id, customer_id, total, is_delivery " +
                " FROM sale WHERE sale.sale_id = ? ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, saleId);
        if(results.next()) {
            sale = mapRowToSale(results);
        }
        return sale;
    }

    @Override
    public List<Sale> getAllSales(){
        List<Sale> saleList = new ArrayList<>();
        String sql = "SELECT sale_id, customer_id, total, is_delivery " +
                " FROM sale ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Sale sale = mapRowToSale(results);
            saleList.add(sale);
        }
        return saleList;
    }

    @Override
    public Sale createSale(Sale sale) {
        String sql = "INSERT INTO sale (customer_id, total, is_delivery) " +
                "values(?,?,?) RETURNING sale_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, sale.getCustomerId(), sale.getTotal(), sale.isDelivery());
        return getSaleById(newId);
    }

    public Sale mapRowToSale(SqlRowSet rowSet){
        try {
            return new Sale(rowSet.getInt("sale_id"),
                    rowSet.getInt("customer_id"),
                    rowSet.getBigDecimal("total"),
                    rowSet.getBoolean("is_delivery"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}


