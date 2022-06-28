package com.aditya.services;

public class OTPGenerator {

	public int generateOTP() {
		int randomPin = 0;
	    //math random generates the random range from 0.0 to less than 1.0
		//so to obtain the range of 0000 to 9999 we have to perform some actions 
		//*9000 + 1000
		//o.o* 9000 + 1000= 1000
		//.9999* 9000 + 1000 = 9999
		randomPin = (int) (Math.random()*9000) + 1000;
		return randomPin;
	}
}
