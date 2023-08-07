package com.thesmartcoders.structural.java.composite;

public class FinanceDepartment implements Department {

    String departmentName;

    FinanceDepartment(String name){
        departmentName = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Department name : " + departmentName);
    }
}
