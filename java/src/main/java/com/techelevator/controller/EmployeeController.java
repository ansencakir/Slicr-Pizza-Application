package com.techelevator.controller;

import com.techelevator.dao.EmployeeDao;
import com.techelevator.dao.JdbcEmployeeDao;
import com.techelevator.model.Customer;
import com.techelevator.model.Employee;
import com.techelevator.model.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {
    private EmployeeDao employeeDao;

    public EmployeeController(JdbcEmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable int id) throws UserNotFoundException {
        return employeeDao.getEmployeeById(id);
    }

    @RequestMapping(path = "/employee", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() throws UserNotFoundException {
        return employeeDao.getAllEmployees();
    }

    @RequestMapping(path= "/employee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeDao.createEmployee(employee);
    }

    @RequestMapping(path = "/employee", method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee){
        employeeDao.updateEmployee(employee, employee.getEmployeeId());
    }

    @RequestMapping(path = "/employee/{id}/delete", method = RequestMethod.PUT)
    public void deleteEmployee(@PathVariable int id){
        employeeDao.deleteEmployee(id);
    }
}