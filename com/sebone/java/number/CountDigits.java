package com.sebone.java.number;

import java.util.Scanner;
/**
* Class Name : CountDigits
* Objective : This class gives the number of digits present in given input
* @author : vaishnavi patel
* Date : 17/03/2022
*/

public class CountDigits {
	/**
     * Method Name : countDigitOfNumber
     * Objective : count digits of number given by user
     * input : integer number 
     * return : returns integer as count
     * Date : 17/03/2022
    */  
	public int countDigitOfNumber(int number) {
		int count=0;
		while(number>0) { 
			count++;
			number/=10;
		}
		return count;                
	}
	
	/**
     * Method Name : main
     * Objective : invokes countDigitofNumber method and display result
     * Date : 17/03/2022
     */  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of scanner class to read input
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to calculate its digit");
		//reading input 
		int number=scanner.nextInt();
	       //creating object of CountDigits class to call its method
	        CountDigits countDigits=new CountDigits();
		//invoking method to calculate digits
		int result=countDigits.countDigitOfNumber(number);
		//displaying result
		System.out.println("number of digits in  "+number+" is = "+result);
		//closing scanner
		scanner.close();
	}

}
