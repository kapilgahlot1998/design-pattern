package com.thesmartcoders.structural.java.composite;

public class Runner {

    public static void main(String[] args) {
        HeadDepartment department = new HeadDepartment("HeadDepartment");
        department.addDepartment(new FinanceDepartment("FinanceDepartment"));
        department.addDepartment(new ScienceDepartment("ScienceDepartment"));
        department.printDepartmentName();

        FinanceDepartment financeDepartment = new FinanceDepartment("Fina department");
        financeDepartment.printDepartmentName();
    }

}
