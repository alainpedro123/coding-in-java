// We can also overloading constructor, because constructors are methods.
// But it's recomend to do so only if we really have to

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        var employee2 = new Employee(10_000);  // only a single argument thanks to Constructor Overloading
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}


// SECONDARY CLASS

package com.alainafonso;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public Employee(int baseSalary){ // CONSTRUCTOR
        this(baseSalary, 0);
    }

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
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or negative");
        this.hourlyRate = hourlyRate;
    }
}