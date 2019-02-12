package com;

import com.controller.Controller;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new EmployeeView().createEmployeeList();
        Controller controller = new Controller();
        controller.maxSalary(employeeList).printEmployee();
    }
}
