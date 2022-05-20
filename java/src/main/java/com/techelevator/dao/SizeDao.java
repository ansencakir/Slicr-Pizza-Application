package com.techelevator.dao;

import com.techelevator.model.Sale;
import com.techelevator.model.Size;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public interface SizeDao {
    public Size getSizeById(String sizeId);

    public List<Size> getAllSizes();

    public Size createSize(Size newSize);

    public void updateSize(Size size, String sizeId);

    public void deleteSize(String id);
}
