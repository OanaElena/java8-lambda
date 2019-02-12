package com.model;

public class Employee {
    private Long id;
    private String name;
    private Department department;
    private Long salary;
    private Long vacantionDays;
    private Shift shift;

    public Employee(Long id, String name, Department department, Long salary, Long vacantionDays, Shift shift) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.vacantionDays = vacantionDays;
        this.shift = shift;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getVacantionDays() {
        return vacantionDays;
    }

    public void setVacantionDays(Long vacantionDays) {
        this.vacantionDays = vacantionDays;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public void printEmployee(){
        System.out.println("Id: "+this.getId());
        System.out.println("Name: "+this.getName());
        System.out.println("Department: "+this.getDepartment().getName());
        System.out.println("Shift: "+this.getShift().getName());
        System.out.println("Salary: "+this.getSalary());
    }
}
