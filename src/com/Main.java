package com;

import com.controller.Controller;
import com.model.Department;
import com.model.Employee;
import com.model.Shift;
import com.view.EmployeeView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new EmployeeView().createEmployeeList();
        Controller controller = new Controller();
      /*  System.out.println("1. Return the employee that has the biggest salary: ");
        controller.maxSalary(employeeList).printEmployee(); */

        /* System.out.println("2. Return the employees that has the biggest salaries: ");
        controller.maxSalaries(employeeList).forEach(Employee::printEmployee);*/

       /* System.out.println("3. Return the employees that has the biggest salaries grouped by departments: ");
        controller.maxSalariesGroupedByDepartment(employeeList).forEach((aLong, employee) -> employee.ifPresent(employee1 -> employee1.printEmployee()));*/

/*        System.out.println("4. Return the employees that are in HR department code:  ");
        controller.loadEmployeesByDepartmentCode(employeeList, "HR").forEach(Employee::printEmployee);*/

/*        System.out.println("5. Return all the employees that do Shift 1 from department IS: ");
        controller.loadEmployeesFromShiftByDepartmentCode(employeeList, 1L, "IS").forEach(Employee::printEmployee);*/

/*        System.out.println("6. Return all the employees that their names start with letter A: ");
        controller.loadEmployeesByNameLetter(employeeList, "A").forEach(Employee::printEmployee);*/

/*        System.out.println("7. Return all the employees sorted by department name");
        controller.loadSortedEmplByDepartmentName(employeeList).forEach(Employee::printEmployee);*/

/*        System.out.println("8. Return how many employees works on a specific shift: "+controller.countEmployeesOnAShift(employeeList, 2L));*/

/*        System.out.println("9. Return all the employees and make their names UPPERCASE: ");
        controller.loadEmployeesWithUppercase(employeeList).forEach(Employee::printEmployee);*/

/*        System.out.println("10. Return all the employees sorted DESC by department name");
        controller.loadEmployeesByDepartmentNameDesc(employeeList).forEach(Employee::printEmployee);*/

/*
        Employee employee = new Employee(13L, "Oxford", new Department(1L, "Human Resources", "HR"), null, 21L, new Shift(1L, "Shift 1"));
        employee.printEmployee();
        System.out.println("11. Return true or false if there is an Employee that has salary unspecified::::"+controller.checkIfSalaryIsNullForTheGivenEmployee(employee));
*/


/*        System.out.println("12. Using the Cosnumer interface we'll create an Employee and print it.");
        controller.consumerEmployee().accept(new Employee(13L, "Oxford", new Department(1L, "Human Resources", "HR"), null, 21L, new Shift(1L, "Shift 1")));*/

        System.out.println("13. Using the match function print true/false if all the employee have known salarie:::."+controller.allMatchSalaries(employeeList));




    }

}
