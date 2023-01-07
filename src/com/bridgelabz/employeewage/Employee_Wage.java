package com.bridgelabz.employeewage;


import java.util.Locale;

public class Employee_Wage {
    public class EmpWageBuilderOOPS{
        public static final int PARTTIME = 1;
        public static final int FULLDAY = 2;
        public static final int empWagePerHr = 20;
        public static final int numOfWorkingDays = 2;
        public static final int workingHr = 8;
        public static final int maximumHrsMonth = 10;
        int FullDayHr = 8;
        int HalfDayHr = 4;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage");
        Employee_Wage empWageBuilderOOPS = new Employee_Wage();
        empWageBuilderOOPS.computeWage("AMAZON", 20, 20, 100);
        empWageBuilderOOPS.computeWage("FLIPKART", 20, 20, 100);
    }

    public void computeWage(String company, int empWagePerHr, int numOfWorkingDays, int maximumHrsMonth) {
        int empHrs;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        while (totalEmpHrs <= maximumHrsMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
        }
        System.out.println("TOtal employee Wage of empl in " + company + "is" + totalEmpWage);

    }

}