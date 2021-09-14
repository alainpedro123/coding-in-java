// I. ENCAPSULATION - bundle the data and the methods that operate on the data in a single unit. The whole idea behind encapsulation is to hide the implementation details from users.

// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}

// EMPLOYEE CLASS

package com.alainafonso;

public class Employee {
    public int baseSalary;     // data (A)
    public int hourlyRate;     // data (A)

// Instead of passing many values as parameter, we encapsulate the data (A) along with the methods (B) that operate on them inside a single object

    public int calculateWage (int extraHours){      // method (B)
        return baseSalary + (extraHours * hourlyRate);
    }
}