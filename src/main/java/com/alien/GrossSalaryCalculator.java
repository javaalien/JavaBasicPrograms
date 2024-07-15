package com.alien;

import java.util.Scanner;

// Java Program to Calculate Gross Salary of Employee

public class GrossSalaryCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Basic Salary of the Employee:");
		double basic = scanner.nextDouble();

		double hra = 0.10 * basic; // 10% of basic
		double da = 0.08 * basic; // 8% of basic
		double grossSalary = basic + hra + da;

		System.out.println("Employee Gross Salary Breakdown:");
		System.out.println("Basic: " + basic);
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
		System.out.println("Gross Salary: " + grossSalary);
	}

}
