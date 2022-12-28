package com.bridgelabz.employeewage;

import java.lang.invoke.SwitchPoint;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
         int workingDays = 20;
         int empWagePerHr = 20;
        int FullDayHr = 8;
        int HalfDayHr = 4;
         int maximumHrInMonth = 100;
        int totalEmployeeHr = 0;
        int totalWorkingDays = 0;
        int empHrs;
        while (totalEmployeeHr <= maximumHrInMonth &&
                totalWorkingDays < workingDays) {
            totalWorkingDays++;
            {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case 1:
                        System.out.println("Employee is full time present");
                        empHrs = FullDayHr;
                        break;
                    case 2:
                        System.out.println("Employee is part time present");
                        empHrs = HalfDayHr;
                        break;
                    default:
                        System.out.println("Employee is absent");
                        empHrs = 0;
                }
                totalEmployeeHr = empHrs + totalEmployeeHr;
                System.out.println("Day" + totalWorkingDays + "EmployeeHr" + empHrs);
            }
            int totalEmployeeWage = totalEmployeeHr * empWagePerHr;
            System.out.println("totalEmployeeWage = " + totalEmployeeWage);

        }
    }
}