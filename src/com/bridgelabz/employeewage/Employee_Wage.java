package com.bridgelabz.employeewage;


public class Employee_Wage {

       public static final int PARTTIME = 1;
       public static final int FULLDAY = 2;
       public static final int empWagePerHr = 20;
       public static final int numOfWorkingDays = 2;
       public static final int workingHr = 8;
       public static final int maximumHrsMonth = 10;
       int FullDayHr = 8;
       int HalfDayHr = 4;

    public static void main(String[] args) {
        int empHrs = 0;
        int totalEmployeeHr = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHr <= maximumHrsMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case PARTTIME:
                    empHrs = 4;
                    break;

                case FULLDAY:
                    empHrs = 8;
                    break;
            }
            totalEmployeeHr = empHrs + totalEmployeeHr;
            System.out.println("Day" + totalWorkingDays + "EmployeeHr" + empHrs);
        }
        int totalEmployeeWage = totalEmployeeHr * empWagePerHr;
        System.out.println("totalEmployeeWage = " + totalEmployeeWage);
    }
}