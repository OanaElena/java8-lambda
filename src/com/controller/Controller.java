package com.controller;

import com.model.Department;
import com.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    //Find the employee that has the biggest salary from the company, only one

    public Employee maxSalary(List<Employee> emplSalary){
        Optional<Employee> maxSalaryEmpl = emplSalary.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        return maxSalaryEmpl.isPresent() ? maxSalaryEmpl.get() : null;
    }

    //Find the employee that has the biggest salary, and if are more than one, show them all

    public List<Employee> maxSalaries(List<Employee> employeeList){
        Employee maxEmplSalary = maxSalary(employeeList);
        return employeeList.stream().filter(employee -> employee.getSalary().compareTo(maxEmplSalary.getSalary()) == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    //Find the employee that has the bigest salary grouped by departments

    public Map<Long, Optional<Employee>> maxSalariesGroupedByDepartment(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment().getId(), Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
    }
}
