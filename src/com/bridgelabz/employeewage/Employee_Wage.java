package com.bridgelabz.employeewage;

import java.lang.invoke.SwitchPoint;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int PARTTIME = 1;
        int FULLDAY = 2;
        int WORKINGDAYS = 20;
        int empWagePerHr = 20;
        int workingHr = 8;
        int dailywage = 0;
        int monthlywage = 0;
        int FullDayHour = 8;
        int HalfDayHour = 4;
        double employeeCheck = Math.floor(Math.random() * 10) % 3;

        switch ((int) employeeCheck) {
            case 1:
                System.out.println("Employee is present");
                System.out.println("Employee is Full Day present");
                dailywage = empWagePerHr * FullDayHour;
                System.out.println("Daily employee wage is " +dailywage);
                monthlywage = dailywage * WORKINGDAYS;
                System.out.println("Monthly wage is " +monthlywage);

            case 2:
                System.out.println("Employee is Half Day Present");
                dailywage = empWagePerHr * HalfDayHour;
                System.out.println("Daily Half Day Employee Wage is " +dailywage);
                monthlywage = dailywage * WORKINGDAYS;
                System.out.println("Monthly wage is " +monthlywage);
        }

        }
    }
