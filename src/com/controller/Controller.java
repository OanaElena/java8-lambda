package com.controller;

import com.model.Department;
import com.model.Employee;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
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
        return employeeList
                .stream()
                .filter(employee -> employee.getSalary().compareTo(maxEmplSalary.getSalary()) == 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    //Find the employee that has the bigest salary grouped by departments

    public Map<Long, Optional<Employee>> maxSalariesGroupedByDepartment(List<Employee> employeeList){
        return employeeList
                .stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment().getId(), Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
    }

    //Find employees that work on a given Department name

    public List<Employee> loadEmployeesByDepartmentCode(List<Employee> employeeList, String departmentCode){
       return employeeList
               .stream()
               .filter(empl -> empl.getDepartment().getCode().equals(departmentCode))
               .collect(Collectors.toList());
    }

    //Find employees that work on a specific shift from a specific department code

    public List<Employee> loadEmployeesFromShiftByDepartmentCode(List<Employee> employeeList, Long shiftId, String departmentCode){

        //return loadEmployeesByDepartmentCode(employeeList, departmentCode).stream().filter(employee -> employee.getShift().getId().compareTo(shiftId) == 0).collect(Collectors.toList());
                                        //or

        return employeeList.stream()
                .filter(employee -> employee.getDepartment().getCode().equals(departmentCode)
                        && employee.getShift().getId().compareTo(shiftId) == 0)
                .collect(Collectors.toList());
    }

    //Find all the employees that their names starts with a specific letter

    public List<Employee> loadEmployeesByNameLetter(List<Employee> employeeList, String startLetter){
        return employeeList
                .stream()
                .filter(employee -> employee.getName().startsWith(startLetter))
                .collect(Collectors.toList());
    }

    //Load all employees list sorted by department name

    public List<Employee> loadSortedEmplByDepartmentName(List<Employee> employeeList){
        return employeeList
                .stream()
                .sorted((empl1, empl2) -> empl1.getDepartment().getName().compareTo(empl2.getDepartment().getName()))
                .collect(Collectors.toList());
    }

    //Count how many employees work on a specific shift

    public Long countEmployeesOnAShift(List<Employee> employeeList,  Long shiftId){
        return employeeList
                .stream()
                .filter(employee -> employee.getShift().getId().equals(shiftId))
                .count();
    }

    //Make all the employee names UPPERCASE and print the employees

    public List<Employee> loadEmployeesWithUppercase(List<Employee> employeelist){
        return employeelist
                .stream()
                .map(employee -> {
                  employee.setName(employee.getName().toUpperCase());
                  return employee;
                })
                .collect(Collectors.toList());
    }

    //Return all the employees sorted by department name DESC

    public List<Employee> loadEmployeesByDepartmentNameDesc(List<Employee> employeeList){
        Comparator<Employee> comparator = (empl1, empl2) -> empl1.getDepartment().getName().compareTo(empl2.getDepartment().getName());

        return employeeList
                .stream()
                .sorted((empl1, empl2) -> comparator.reversed().compare(empl1, empl2))
                .collect(Collectors.toList());
    }

    //Return true of false if the given employee had empty salary

    public boolean checkIfSalaryIsNullForTheGivenEmployee(Employee employee){
        Predicate<Employee> predicate = (empl) -> empl.getSalary() == null;
        return predicate.test(employee);
    }

    //Use Consumer and print an Employee
    public Consumer<Employee> consumerEmployee(){
        Consumer<Employee> consumer = Employee::printEmployee;
        return consumer;
    }
}
