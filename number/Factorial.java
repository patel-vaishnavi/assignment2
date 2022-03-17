package number;

import java.util.Scanner;

public class Factorial {
     
	//calculates factorial of the given input and return it
	
    public int factNumber(int num) {
    	    int i,fact=1;
    	//loop to calculate factorial
    	for(i=num;i>0;i--)    
    	    fact=fact*i;
    	
    	return fact;
     }
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
	     }

    }
