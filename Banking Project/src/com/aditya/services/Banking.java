package com.aditya.services;

import java.util.Scanner;

public class Banking {
	
	int bankBalance = 1000;
	Scanner sc = new Scanner(System.in);
	OTPGenerator obj = new OTPGenerator();
	
	//method to deposit
	public void deposit() {
		int amount;
		System.out.println("\nEnter the amount to be deposited.");
		amount = sc.nextInt();
		
		if(amount > 0) {
			System.out.println("\nAmount " + amount + " Rs deposited successfully!");
			bankBalance += amount;
			System.out.println("Remaining bank balance: " + bankBalance+ " Rs");
		}
		else {
			System.out.println("\nEnter the correct amount!");
		}
	}
	
	//method to withdraw
	public void withdrawal() {
		int amount;
		System.out.println("\nEnter the amount to be withdrawn");
		amount = sc.nextInt();
		
		if(amount > 0 && bankBalance - amount> 0) {
			System.out.println("\nAmount " + amount + " Rs withdrawal successfull!");
			bankBalance -= amount;
			System.out.println("Remaining bank balance: " + bankBalance+ "Rs");
		}
		else {
			System.out.println("\nEnter the correct amount or insuffient funds!");
		}
	}
	
	//method to transfer
	public void transfer() {
		
		int amount;
		long beneficiaryAccount;
		int generatedOTP = obj.generateOTP();
		System.out.println("Generated OTP " + generatedOTP);
		System.out.println("Please enter the OTP");
		int inputOTP = sc.nextInt();
		
		if(generatedOTP == inputOTP) {
			System.out.println("OTP Verified Successfully!");
			System.out.println("\nYour bank balance is: " + bankBalance+ " Rs");
			System.out.println("\nPlease enter the amount and the account no. to which it is to be transferred!");
			amount = sc.nextInt();
			beneficiaryAccount = sc.nextLong();
			
		
			if(amount > 0 && bankBalance - amount> 0) {
				System.out.println("\nAmount " + amount + " Rs transfer to beneficiary "+ beneficiaryAccount+ " successfull!");
				bankBalance -= amount;
				System.out.println("Remaining bank balance: " + bankBalance+ " Rs");
			}
			else {
				System.out.println("\nAmount invalid or insufficient funds!");
			}
		}
		else {
			System.out.println("\nOTP Verification Failed!");
		}
	}

}
