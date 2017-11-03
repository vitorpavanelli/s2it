package com.example.intnumber;

public class CalculateCService {

	public long getC(int ... number) throws NumberNotValidException {
		if (number.length != 2) {
			throw new NumberNotValidException("Please, enter 2 int numbers");
		}
		
		char[] numberA = String.valueOf(number[0]).toCharArray();
		char[] numberB  = String.valueOf(number[1]).toCharArray();
		
		// prepare numbers to be iterated over		
		char[] leftNumber = numberB;
		int size = numberA.length;
		if (numberB.length < numberA.length) {			
			size = numberB.length;
			leftNumber = numberA;
		}
		
		// start setting C number
		String c = "";
		int index = 0;
		for (; index < size; index++) {
			c += String.valueOf(numberA[index]) + String.valueOf(numberB[index]); 
		}
		
		// set left numbers
		if (numberB.length != numberA.length) {
			for (; index < leftNumber.length; index++) {
				c += String.valueOf(leftNumber[index]);
			}
		}
		
		long numberC = Long.parseLong(c);
		return numberC > 1000000 ? -1 : numberC;		
	}
}
