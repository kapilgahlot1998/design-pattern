package com.thesmartcoders.structural.java.composite;

public class ScienceDepartment implements Department {

    String departmentName;

    ScienceDepartment(String name){
        departmentName = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Department name : "+ departmentName);
    }
}
