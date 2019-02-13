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

    //Find employees that work on a given Department name

    public List<Employee> loadEmployeesByDepartmentCode(List<Employee> employeeList, String departmentCode){
       return employeeList.stream().filter(empl -> empl.getDepartment().getCode().equals(departmentCode)).collect(Collectors.toList());
    }

    //Find employees that work on a specific shift from a specific department code

    public List<Employee> loadEmployeesFromShiftByDepartmentCode(List<Employee> employeeList, Long shiftId, String departmentCode){

        //return loadEmployeesByDepartmentCode(employeeList, departmentCode).stream().filter(employee -> employee.getShift().getId().compareTo(shiftId) == 0).collect(Collectors.toList());
                                        //or

        return employeeList.stream().filter(employee -> employee.getDepartment().getCode().equals(departmentCode) && employee.getShift().getId().compareTo(shiftId) == 0).collect(Collectors.toList());
    }
}
