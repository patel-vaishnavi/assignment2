package com.sebone.java.number;

import java.util.Scanner;
/**
* Class Name : Factorial
* Objective : This class gives the factorial of given number
* @author : vaishnavi patel
* Date : 17/03/2022
*/

public class Factorial {
     /**
      * Method Name : factNumber
      * Objective : calculates factorial of number given by user
      * input : integer number 
      * return : returns integer as factorial
      * Date : 17/03/2022
     */  
    public int factNumber(int number) {
	int i,factorial=1;
	//loop to calculate factorial
	for(i=number;i>0;i--)    
	factorial=factorial*i;
	return factorial;
    }
    /**
     * Method Name : main
     * Objective : invokes factNumber method and display result
     * Date : 17/03/2022
    */  
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        //creating object of scanner class to read input
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number to calculate its factorial");
	//reading input 
	int num=scanner.nextInt();
	//creating object of Factorial class to call its method
	Factorial factorial=new Factorial();
	//invoking method to calculate factorial
	int result=factorial.factNumber(num);
	//displaying result
	System.out.println("factorial of "+num+" is = "+result);
	//closing scanner
	scanner.close();
   }

}
