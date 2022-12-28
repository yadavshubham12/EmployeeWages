package com.bridgelabz.employeewage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int empWagePerHr = 20;
        int workingHr = 8;
        int dailywage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1){
            dailywage = empWagePerHr * workingHr;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily wage of employee is : " +dailywage);


    }
}
