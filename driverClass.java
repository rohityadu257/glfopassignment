package com.glAssignment.drivermain;

import java.util.Scanner;

import com.glAssignment.Services.credentialservices;
import com.glAssignment.employee.employee;

public class driverClass {
	
	
	public static void main (String []args) {
		
		Scanner sc =new Scanner(System.in);
	
		//String dept= null;
		System.out.println("Enter the First Name");
		String FirstName = sc.next();
		System.out.println("Enter the last Name");
		String Lastname = sc.next();
		
		
		
		
		System.out.println("Please Enter the valid Department \n 1.Technical \n 2.Admin \n 3.Human Resources \n 4.Legal");
	
		String dept = null;
			int choice = sc.nextInt();
				if(choice == 1) {
					dept = "tech";
				}
				else if(choice == 2) {
					dept = "admin";
				}
				else if(choice == 3) {
					dept = "hr";
				}
				else if(choice == 4) {
					dept ="legal";
				}
				else {
					System.out.println("Enter Valid Department");
					
				}
				
				
		employee emp = new employee(FirstName, Lastname,dept);
						
	   credentialservices credential = new credentialservices();
	   String emailid = credential.generateCredential(emp);
	   String password = credential.generatePassword();
	   credential.DisplayCredentials(emp, password,emailid);
	   
	   sc.close();
	}
	
	}


