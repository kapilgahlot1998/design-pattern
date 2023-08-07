package com.thesmartcoders.structural.java.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    String departmentName;
    List<Department> departmentList;

    HeadDepartment(String departmentName){
        this.departmentName = departmentName;
        departmentList = new ArrayList<>();
    }

    void addDepartment(Department department){
        departmentList.add(department);
    }

    void removeDepartment(Department department){
        departmentList.remove(department);
    }

    @Override
    public void printDepartmentName() {
        departmentList.forEach(Department::printDepartmentName);
    }
}
