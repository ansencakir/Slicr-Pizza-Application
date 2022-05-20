package com.techelevator.dao;

import com.techelevator.model.Pizza;
import com.techelevator.model.Sale;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public interface SaleDao {
    public Sale getSaleById(int saleId);

    public List<Sale> getAllSales();

    Sale createSale(Sale sale);


}
