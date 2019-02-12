package com.view;

import com.model.Department;
import com.model.Employee;
import com.model.Shift;

import java.util.ArrayList;
import java.util.List;

public class EmployeeView {

    public List<Employee> createEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1L, "Ryan", new Department(1L, "Human Resources", "HR"), 3000L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(2L, "Miriam", new Department(2L, "Insurance", "IS"), 3340L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(13L, "Marimer", new Department(1L, "Human Resources", "HR"), 3040L, 21L, new Shift(3L, "Shift 3")));
        employeeList.add(new Employee(4L, "Othilia", new Department(1L, "Human Resources", "HR"), 2000L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(5L, "Felicia", new Department(1L, "Human Resources", "HR"), 1400L, 21L, new Shift(3L, "Shift 3")));
        employeeList.add(new Employee(6L, "Felicidad", new Department(2L, "Insurance", "IS"), 3300L, 21L, new Shift(3L, "Shift 3")));
        employeeList.add(new Employee(7L, "Humana", new Department(1L, "Human Resources", "HR"), 1300L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(8L, "Shivani", new Department(1L, "Human Resources", "HR"), 1000L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(9L, "Syria", new Department(3L, "Transport", "TR"), 2100L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(10L, "Sudan", new Department(1L, "Human Resources", "HR"), 3400L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(111L, "Valentina", new Department(1L, "Human Resources", "HR"), 3400L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(12L, "Maria", new Department(2L, "Insurance", "IS"), 3400L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(13L, "Oxford", new Department(1L, "Human Resources", "HR"), 3000L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(14L, "Mathew", new Department(3L, "Transport", "TR"), 3000L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(15L, "Iosif", new Department(3L, "Transport", "TR"), 2300L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(16L, "Judah", new Department(1L, "Human Resources", "HR"), 1200L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(18L, "Camille", new Department(1L, "Human Resources", "HR"), 2300L, 21L, new Shift(2L, "Shift 2")));
        employeeList.add(new Employee(21L, "Corina", new Department(3L, "Transport", "TR"), 3000L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(123L, "Corsica", new Department(3L, "Transport", "TR"), 1200L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(143L, "Florence", new Department(1L, "Human Resources", "HR"), 1200L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(156L, "Piaf", new Department(2L, "Insurance", "IS"), 3200L, 21L, new Shift(3L, "Shift 3")));
        employeeList.add(new Employee(166L, "Nathaniel", new Department(2L, "Insurance", "IS"), 3300L, 21L, new Shift(3L, "Shift 3")));
        employeeList.add(new Employee(176L, "Dulce", new Department(2L, "Insurance", "IS"), 3100L, 21L, new Shift(1L, "Shift 1")));
        employeeList.add(new Employee(198L, "Anahi", new Department(1L, "Human Resources", "HR"), 3000L, 21L, new Shift(1L, "Shift 1")));
        return employeeList;
    }
}
