package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Resturant;
import com.example.demo.services.Resturantservices;
import com.example.demo.util.UserInputException;

@RestController
@RequestMapping("api/v2")
public class Resturantcontroller {
    @Autowired
    private Resturantservices rs;
    @GetMapping("/displayResturant")
    public List<Resturant> sayHello() {
        List<Resturant> ls=new ArrayList<Resturant>();
        ls=rs.displayResturants();
        return ls;
    }
    
    
    @PostMapping("/addResturant")
    public ResponseEntity<Resturant> saveUser(@RequestBody Resturant resturant) throws UserInputException {
      // Employee employee1 = es.addEmployee(employee);
         return new ResponseEntity<Resturant>(rs.addResturant(resturant),HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{resId}")
    public ResponseEntity<Boolean> delRes(@PathVariable int resId) throws UserInputException {
       
        return new ResponseEntity<Boolean>(rs.deleteResturant(resId),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Boolean> updateRes(@PathVariable int id,@RequestBody Resturant resturant) throws UserInputException {
       
       return new ResponseEntity<Boolean>(rs.updateResturant(id,resturant),HttpStatus.OK);
    }

 

    @GetMapping("/getResturant/{id}")
    public ResponseEntity<Resturant> getResOnId(@PathVariable int id) throws UserInputException {
      // List<Employee> empList=es.searchEmployee(id);
       return new ResponseEntity<Resturant>(rs.searchResturant(id),HttpStatus.OK);
    }    
    
    @GetMapping("/searchByName/{resName}")
    public ResponseEntity<Resturant> searchByResName(@PathVariable String resName)throws UserInputException {
    // List<Employee> empList=es.searchEmployee(id);
    return new ResponseEntity<Resturant>(rs.searchByResName(resName),HttpStatus.OK);
    }
    
    @GetMapping("/searchByRating/{resRating}")
    public ResponseEntity<List<Resturant>> searchByResRating(@PathVariable float resRating)throws UserInputException {
    // List<Employee> empList=es.searchEmployee(id);
    return new ResponseEntity<List<Resturant>>(rs.searchByResRating(resRating),HttpStatus.OK);
    }
    
    
    @GetMapping("/search/v3/{resRating}")
    public ResponseEntity<List<Resturant>> searchByResRating1(@PathVariable float resRating) {
        return new ResponseEntity<List<Resturant>>(rs.searchByResRating1(resRating), HttpStatus.OK);
    }
    

 

}
