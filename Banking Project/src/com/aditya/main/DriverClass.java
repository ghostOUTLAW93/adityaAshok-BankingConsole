package com.aditya.main;

import java.util.Scanner;

import com.aditya.model.Customer;

import com.aditya.services.*;

/*
 * Version 1 for Indian Bank with following functionalities:
 * 1) Credential verification
 * 2) Deposit
 * 3) Withdrawal
 * 4) Transfer
 * 5) OTP generation
 * 
 * Instructions:
 * 1) Two fields-> bankAccountNo and password-> all values can be hardcoded.
 * 2) Ask user to enter credentials, if credentials match user will be given four options:
 * 		1. Deposit
 * 		2. Withdrawal 
 * 		3. Transfer
 * 		4. Logout
 * 3) Upon entering the option, user should be able to perform operations and all the operation must be recorded in the transaction file.
 * 4) For transfer, system will generate 4-digits OTP. Before transferring money, user should verify the OTP.
 * 5) Amount verification(withdrawal amount<balance) conditions must be addressed.  
 */

/*Points to remember:
	1) Use modularisation as far as possible.
	2) Use main class in package other than the model class.
	2) Always use separate class for data-> model class in model package.
	4) Use services offered in another package*/
	


public class DriverClass {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("123456","password");
		
		try (//creating scanner object for getting user input
		Scanner sc = new Scanner(System.in)) {
			Banking bobj = new Banking();
			
			String bankAccountNo;
			String password;
			
			System.out.println("Welcome to login page\n");
			
			System.out.println("Enter the bank account no");
			bankAccountNo = sc.nextLine();
			
			System.out.println("Enter the password");
			password = sc.nextLine();
			
			if(customer1.getBankAccountNo().equals(bankAccountNo) && 
					customer1.getPassword().equals(password)) {
				System.out.println("\nWelcome to Indian Bank\n");
				int option;
				
				do {
					System.out.println("--------------------------------------------");
					System.out.println("Please enter the options you want to perform");
					System.out.println("1. Deposit");
					System.out.println("2. Withdrawal");
					System.out.println("3. Transfer");
					System.out.println("0. Logout");
					System.out.println("--------------------------------------------");
					
					option = sc.nextInt();
					
					switch(option) {
					
					case 0:
						break;
					case 1: bobj.deposit();
						break;
					case 2: bobj.withdrawal();
						break;
					case 3: bobj.transfer();
						break;
					default:
						System.out.println(option +" is INVALID! Enter the valid option.");
					}
					
				}while(option != 0);
				System.out.println("Exited successfully!");
			}
			else {
				System.out.println("Invalid credentials");
			}
		}

	}

}
