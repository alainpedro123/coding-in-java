// CONSTRUCTOR - is a special method that is called When we create a new object (an instance of a class)

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}

// SECONDARY CLASS

package com.alainafonso;

public class Employee {
    private int baseSalary; // **
    public int hourlyRate;	// **

    public Employee(int baseSalary, int hourlyRate){ // CONSTRUCTOR
        setBaseSalary(baseSalary);  // initialize this fields (**) based on the value we receive in the parameters
        setHourlyRate(hourlyRate);
    }
    public int calculateWage (int extraHours){      // method (B)
        return baseSalary + (extraHours * hourlyRate);
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