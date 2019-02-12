package com.controller;

import com.model.Employee;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Controller {

    //Find the employer that has the biggest salary from the company, only one

    public Employee maxSalary(List<Employee> emplSalary){
        System.out.println("1. Return the employee that has the biggest salary: ");
        Optional<Employee> maxSalaryEmpl = emplSalary.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        return maxSalaryEmpl.isPresent() ? maxSalaryEmpl.get() : null;
    }
}
