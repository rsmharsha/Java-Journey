package com.rsmharsha;

public class Employee {
    // instance field
    private int baseSalary;
    private int hourlyRate;
    // suppose extraHours change every month so we pass it directly as an argument!
    // public int extraHours;

    // static field
    public static int numberOfEmployees;


    // constructor overloading
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++; // number of employee increases as the number of objects of Employee increases.
    }

    public Employee(int baseSalary){
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        numberOfEmployees++;
    }

    /*
    public Employee(int baseSalary){
        this(baseSalary,0);
    }
     */

    // static method
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }


    // method overloading
    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    // getter and setter
    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    // getter and setter
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0){
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        }
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
}
