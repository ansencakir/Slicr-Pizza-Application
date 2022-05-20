package com.techelevator.dao;

import com.techelevator.model.Customer;
import com.techelevator.model.Employee;
import java.util.List;

public interface EmployeeDao {
    public Employee getEmployeeById(int employeeId);

    public List<Employee> getAllEmployees();

    public Employee createEmployee(Employee newEmployee);

    public void updateEmployee(Employee employee, int employee_id);

    public void deleteEmployee(int id);
}
