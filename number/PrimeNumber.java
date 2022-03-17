package number;

import java.util.Scanner;

public class PrimeNumber {
      
	//check for the number if its prime or not and return true/false
	public boolean isPrime(int num) {
    	        
    	 int i;
    	 for(i=2;i<=num/2;i++)
    	    if(num%i==0)
    	       return false;
    	   
    	   return true;
    	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//creating object of scanner class to read input
		Scanner scanner=new Scanner(System.in);
		  System.out.println("enetr the number to be checked");
		   
		  //reading input
		  int num=scanner.nextInt();
		   
	        //creating object of IsPrime class to call its method
		   PrimeNumber primenum=new PrimeNumber();
		   
		   //invoking function to check if given input is prime or not
		   
		   if(primenum.isPrime(num))
	           System.out.println(num +" is a prime number");  //displaying the result if either it is prime or not
		   else
			   System.out.println(num +" is not a prime number");
	           
	     }
         
	       
     }
