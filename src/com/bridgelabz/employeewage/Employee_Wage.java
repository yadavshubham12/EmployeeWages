package com.bridgelabz.employeewage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int PARTTIME = 1;
        int FULLDAY = 2;
        int empWagePerHr = 20;
        int workingHr = 8;
        int dailywage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            dailywage = empWagePerHr * workingHr;
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
            int FullDayHr = 8;
            int HalfDayHr = 4;
            int dailyWage = 0;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(empcheck);

            switch (empcheck) {
                case 1: {
                    System.out.println("Employee is full day present");
                    empCheck = empWagePerHr * FullDayHr;
                }
                break;
                case 2: {
                    System.out.println("Employee is half day present");
                    empCheck = empWagePerHr + HalfDayHr;
                }
                break;
                case 3: {
                    System.out.println("Employee is absent");
                }
            }
            System.out.println("Daily wage of employee is : " + dailywage);
            System.out.println("Employee Wage: " + dailyWage);

        }
    }
}
