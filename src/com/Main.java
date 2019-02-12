package com;

import com.controller.Controller;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new EmployeeView().createEmployeeList();
        Controller controller = new Controller();
      /*  System.out.println("1. Return the employee that has the biggest salary: ");
        controller.maxSalary(employeeList).printEmployee();
        System.out.println("2. Return the employees that has the biggest salaries: ");
        controller.maxSalaries(employeeList).forEach(Employee::printEmployee);*/
        System.out.println("3. Return the employees that has the biggest salaries grouped by departments: ");
        controller.maxSalariesGroupedByDepartment(employeeList).forEach((aLong, employee) -> employee.ifPresent(employee1 -> employee1.printEmployee()));
    }
}
