package com.sebone.java.strings;

import java.util.Scanner;
/**
* Class Name : ReverseString
* Objective : This class reverse the given input string
* @author : vaishnavi patel
* Date : 17/03/2022
*/

public class ReverseString 
{
	/**
     * Method Name : reverseTheString
     * Objective : calculates factorial of number given by user
     * input : integer number 
     * return : returns integer as factorial
     * Date : 17/03/2022
    */  
	
	public String reverseTheString(String string) {
		   int i,j;
		   //to get the length of string
		   j=string.length(); 
		   char reverse[]= string.toCharArray();
		   char temp;
		   //reversing the array
		   for(i=0,j=j-1;i<j;i++,j--) {
			  temp=reverse[i];
			  reverse[i]=reverse[j];
			  reverse[j]=temp;
		   } 
		   //creating object of string to return result
		   String result=new String(reverse);
		   return result;
	}
	/**
     * Method Name : main
     * Objective : invokes reverseTheString method and display result
     * Date : 17/03/2022
    */  
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 //creating object of scanner class to read input
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("enter the string");
		 //reading input 
		 String input=scanner.next();
		 //creating object of IsPrime class to call its method
		 ReverseString reverseString=new ReverseString();
		 //invoking method to reverse input
		 String result = reverseString.reverseTheString(input);
		 //displaying result
		 System.out.println("reverse of "+input+" is = "+result);
		 //closing scanner
		 scanner.close();
	}

}
