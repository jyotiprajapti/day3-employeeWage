package com.bridgelabs;
import java.util.Random;
public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		Random attendance =new Random();
		int atndc = attendance.nextInt(2);
		if(atndc ==0) {
			System.out.println("employee is absent");
		}
		else {
			System.out.println("employee is present");
		}
  }
}