package number;

import java.util.Scanner;

public class SumNumber {
	
	//calculates sum of numbers from 1 to given input and return it
    public int sumofNnumbers(int n) {
    	   int i,sum=0;
    	   
    	   //loop to calculate sum
    	  for(i=1;i<=n;i++)
    	    sum=sum+i;
    	
    	return sum;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of scanner class to read input
				Scanner scanner=new Scanner(System.in);
				 
				System.out.println("enter the number till you want sum");
			//reading input 	
				int num=scanner.nextInt();
				
			//creating object of Sumnumber class to call its method
				
				SumNumber sumnumber=new SumNumber();
				
				//invoking method to calculate sum
				int result = sumnumber.sumofNnumbers(num);
				
				//displaying sum
				System.out.println("sum of 1 to "+num+" is = "+result);
				  
      }

  }
