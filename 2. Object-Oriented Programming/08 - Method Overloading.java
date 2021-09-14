// METHOD OVERLOADING - it means creating different implementation of a method with different parameters
// It's ideal to overload a method when dealing with completely different type of parameters

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();  // overloading but we don't receive any value
        System.out.println(wage);
    }
}


// EMPLOYEE CLASS

package com.alainafonso;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){ // CONSTRUCTOR
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
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
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or negative");
        this.hourlyRate = hourlyRate;
    }
}