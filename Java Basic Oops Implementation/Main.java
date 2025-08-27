package com.rsmharsha;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 18);
        var employee2 = new Employee(10_000);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(20);
        int wage2 = employee2.calculateWage();
        System.out.println(wage);
        System.out.println(wage2);
    }

}
