// ENCAPSULATION - bundle the data and the methods that operate on the data in a single unit.

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}



// EMPLOYEE CLASS
package com.alainafonso;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public int calculateWage (int extraHours){      // method (B)
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary) {
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

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or negative");
        this.hourlyRate = hourlyRate;
    }
}
