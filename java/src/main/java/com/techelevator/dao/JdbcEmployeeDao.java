package com.techelevator.dao;

import com.techelevator.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcEmployeeDao implements EmployeeDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcEmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee getEmployeeById(int employeeId){
        Employee employee = new Employee();
        String sql = "SELECT employee_id, user_id, first_name, last_name, phone_number, email_address, salary " +
                " FROM employee WHERE employee.employee_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, employeeId);
        if(results.next()) {
            employee = mapRowToEmployee(results);
        }
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        String sql = "SELECT employee_id, user_id, first_name, last_name, phone_number, email_address, salary " +
                " FROM employee ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Employee employee = mapRowToEmployee(results);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public Employee createEmployee(Employee newEmployee){
        String sql = "INSERT INTO employee (employee_id, user_id, first_name, last_name, phone_number, email_address, salary) " +
                "values(?, ?, ?, ?, ?, ?, ?) RETURNING employee_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, newEmployee.getEmployeeId(), newEmployee.getUserId(), newEmployee.getFirstName(), newEmployee.getLastName(),
                newEmployee.getPhoneNumber(), newEmployee.getEmailAddress(), newEmployee.getSalary());
        return getEmployeeById(newId);
    }

    public void updateEmployee(Employee employee, int employee_id){
        String sql = "UPDATE employee SET " +
                "employee_id = ?, user_id = ?, first_name = ?, last_name = ?, phone_number = ?, email_address = ?, salary = ? " +
                "WHERE (employee_id) = ?;";
        jdbcTemplate.update(sql, employee.getEmployeeId(), employee.getUserId(), employee.getFirstName(), employee.getLastName(),
                employee.getPhoneNumber(), employee.getEmailAddress(), employee.getUserId(), employee_id);
    }

    public void deleteEmployee(int id){
        String sql = "DELETE FROM employee WHERE employee.employee_id = ?";
        jdbcTemplate.update(sql, id);
    }

    public Employee mapRowToEmployee(SqlRowSet rowSet){
        try {
            return new Employee(rowSet.getInt("employee_id"),
                    rowSet.getInt("user_id"),
                    rowSet.getString("first_name"),
                    rowSet.getString("last_name"),
                    rowSet.getString("phone_number"),
                    rowSet.getString("email_address"),
                    rowSet.getBigDecimal("salary"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}