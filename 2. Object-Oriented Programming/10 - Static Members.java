// Static fields or class members - these are the fields and methods that belong to a class not an object
// We use them in situation where we want to represent a concept that should be in a single place like the "numberOfEmployees". When a value is independent of objects and I want share across all objects

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        var employee2 = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}


// SECONDARY CLASS

package com.alainafonso;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public static int numberOfEmployees;  // 1. STATIC MEMBER

    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

        // Every time we create a new employee object we want to increment the number of employees
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){    // 2. STATIC METHOD
        System.out.println(numberOfEmployees);
    }

    public int calculateWage (int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage (){
        return calculateWage(0);    // overloaded the calculateWage method twice, but in this implementation we don't receive any value
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or negative");
        this.hourlyRate = hourlyRate;
    }
}