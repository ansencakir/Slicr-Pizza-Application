package com.techelevator.controller;

import com.techelevator.dao.JdbcSizeDao;
import com.techelevator.dao.SizeDao;
import com.techelevator.model.Customer;
import com.techelevator.model.Size;
import com.techelevator.model.Topping;
import com.techelevator.model.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SizeController {
    private SizeDao sizeDao;

    public SizeController(JdbcSizeDao SizeDao){
        this.sizeDao = SizeDao;
    }

    @RequestMapping(path = "/size/{id}", method = RequestMethod.GET)
    public Size getSizeById(@PathVariable String id) throws UserNotFoundException {
        return sizeDao.getSizeById(id);
    }

    @RequestMapping(path = "/size", method = RequestMethod.GET)
    public List<Size> getAllSizes() throws UserNotFoundException {
        return sizeDao.getAllSizes();
    }

    @RequestMapping(path = "/size", method = RequestMethod.POST)
    public Size createSize(@RequestBody Size size){
        return sizeDao.createSize(size);
    }

    @RequestMapping(path = "/size", method = RequestMethod.PUT)
    public void updateSize(@RequestBody Size size){
        sizeDao.updateSize(size, size.getSizeId());
    }

    @RequestMapping(path = "/size/{id}/delete", method = RequestMethod.PUT)
    public void deleteSize(@PathVariable String id){
        sizeDao.deleteSize(id);
    }
}
