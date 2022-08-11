package com.example.day6.controller.Employees;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Controller {

    private ArrayList<String> employeeslist = new ArrayList<>();

    @GetMapping("/Name")
    public ArrayList<String> getEmployees() {
        return employeeslist;
    }

    @PostMapping("/Name")
    public String inputName(@RequestBody String Employees, @PathVariable
    Integer index) {
        employeeslist.add(Employees);
        return "Employees added successfully";
    }
    @PutMapping("/Name/{index}")
    public String updateEmployees(@RequestBody String Employees,@PathVariable Integer index){
        employeeslist.set(index, Employees);
        return "Employees updated successfully";
    }
    @DeleteMapping("/Name/{index}")
    public String removeName(@PathVariable int index) {
        employeeslist.remove(index);
        return "Grades removed successfully";
    }



}
