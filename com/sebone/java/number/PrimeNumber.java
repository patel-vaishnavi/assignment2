package com.sebone.java.number;

import java.util.Scanner;

/**
* Class Name : PrimeNumber
* Objective : This class check weather the number given by the user is prime or not
* @author : vaishnavi patel
* Date : 17/03/2022
*/

public class PrimeNumber {
	/**
     * Method Name : isPrime
     * Objective : check for the number if its prime or not
     * input : integer number 
     * return : returns boolean value true for prime and false for not prime
     * Date : 17/03/2022
    */  
	
	public boolean isPrime(int number) {
		int i;
    	for(i=2;i<=number/2;i++)
    	   if(number%i==0)
    	     return false;
    	return true;
    }
	/**
     * Method Name : main
     * Objective : invokes isprime method and display result
     * Date : 17/03/2022
    */  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of scanner class to read input
		Scanner scanner=new Scanner(System.in);
		System.out.println("enetr the number to be checked");
		//reading input
		int number=scanner.nextInt();
		//creating object of IsPrime class to call its method
		PrimeNumber primeNumber=new PrimeNumber();
		//invoking function to check if given input is prime or not
		if(primeNumber.isPrime(number))
		   System.out.println(number +" is a prime number");  //displaying the result if either it is prime or not
		else
		   System.out.println(number +" is not a prime number");
		//closing scanner
		scanner.close();
			  
   }
         
	       
}
