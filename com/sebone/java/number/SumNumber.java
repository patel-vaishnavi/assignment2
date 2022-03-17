package com.sebone.java.number;

import java.util.Scanner;
 /**
 * Class Name : SumNumber
 * Objective : This class gives the sum of numbers from 1 to given input
 * @author : vaishnavi patel
 * Date : 17/03/2022
 */

public class SumNumber {
	/**
     * Method Name : sumofNnumbers
     * Objective : calculates sum of numbers from 1 to given input
     * input : integer number 
     * return : returns integer as sum
     * Date : 17/03/2022
    */  
	
    public int sumofNnumbers(int number) {
	    int i,sum=0;
	    //loop to calculate sum
	    for(i=1;i<=number;i++)
	      sum=sum+i;
	    return sum;
    }
    /**
     * Method Name : main
     * Objective : invokes sumofNnumbers method and display result
     * Date : 17/03/2022
    */  
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of scanner class to read input
	    Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number till you want sum");
	    //reading input 	
		int num=scanner.nextInt();
	    //creating object of Sumnumber class to call its method
		SumNumber sumNumber=new SumNumber();
		//invoking method to calculate sum
		int result = sumNumber.sumofNnumbers(num);
	    //displaying sum
		System.out.println("sum of 1 to "+num+" is = "+result);
	    //closing scanner
	    scanner.close();
    }

 }
