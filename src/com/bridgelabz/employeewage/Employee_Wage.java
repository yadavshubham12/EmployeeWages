package com.bridgelabz.employeewage;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int PARTTIME = 1;
        int FULLDAY = 2;
        int empWagePerHr = 20;
        int workingHr = 8;
        int dailywage = 0;
            System.out.println("Employee is present");
            int FullDayHr = 8;
            int HalfDayHr = 4;
            int dailyWage = 0;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            if (empCheck == FULLDAY){
                FullDayHr = 8;
                System.out.println("Employee is full day present");
                dailyWage = empWagePerHr * FullDayHr;
                System.out.println("Daily wage of employee is : " +dailyWage);
            }
            else if (empCheck == PARTTIME){
                HalfDayHr = 4;
                System.out.println("Employee is part time present");
                dailyWage = empWagePerHr * HalfDayHr;
                System.out.println("Daily wage of employee is : " +dailyWage);

            }
            else {
                System.out.println("Employee is absent");
            }
            System.out.println("Daily wage of employee is : " +dailywage);

    }
}
