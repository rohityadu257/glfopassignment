package com.glAssignment.Services;

import java.util.Random;

import com.glAssignment.employee.employee;

public class credentialservices {
	
	
	public String generatePassword ()
	{
		
		String password ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+~";
		char [] array = new char[8];
		Random random =new Random();
		for (int i = 0; i<array.length;i++)
		{
			array[i]=password.charAt(random.nextInt(password.length()));
		}
		
		return new String (array);
		 
	}
	
	public String generateCredential(employee emp)
	{
		return  emp.getFirstname()+ "." + emp.getLastname() + "@" + emp.getdepartment() + ".gl.in" ;
		
	}

	public void DisplayCredentials(employee emp, String password,String email)
	{
		
		System.out.println("Dear "+emp.getFirstname() + "   "  + "your generated credentials are as follows :  \n "  );
		System.out.println("Email ----->" + email);
		System.out.println("Password ------>" + password);
	}
}
