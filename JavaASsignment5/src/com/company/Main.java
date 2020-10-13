package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id = ");
        int id = scanner.nextInt();
        System.out.print("Monthly Basic = ");
        double monthlyBasic = scanner.nextDouble();
        System.out.print("Pf Rate = ");
        float pfRate = scanner.nextFloat();
        System.out.print("Name = ");
        String name = scanner.nextLine();

        Employee employee = new Employee(name,id,monthlyBasic,pfRate);
        System.out.println("Monthly basic is " + employee.getMonthlyBasic());
        System.out.println("Annual basic is " + employee.getAnnualBasic());
        System.out.println("Monthly Gross Salary is " + employee.getMonthlyGrossSalary());
        System.out.println("Annual Gross Salary is " + employee.getAnnualGrossSalary());
        System.out.println("Monthly Deductions is " + employee.getMonthlyDeductions());
        System.out.println("PF Rate is " + employee.getPfRate());
        System.out.println("Monthly Take Home is " + employee.getMonthlyTakeHome());
        System.out.println("Annual Take Home is " + employee.getAnnualTakeHome());

        scanner.close();
    }
}