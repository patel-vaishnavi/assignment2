package com.sebone.java.number;

import java.util.Scanner;

public class Fibonacci 
{
    //return fibonacci series upto given input
	public void fibonacciSeries(int num)
	{
		      
		    	  
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0,b=1,c,num;
	     
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
	      while(a<=num)
	      {
	    	 System.out.println(a); 
	    	  c=a+b;
	    	  a=b;
	    	  b=c;
	      }
        scanner.close();
	}

}
