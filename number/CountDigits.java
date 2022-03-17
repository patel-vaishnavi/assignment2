package number;

import java.util.Scanner;

public class CountDigits {
     
	//calculates the no of digits in given input and returns it
	public int countDigitOfNumber(int num) {
		    int i,count=0;
		    
		   while(num>0){ 
		     count++;
		     num=num/10;
		   }
              return count;                
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of scanner class to read input
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("enter the number to calculate its digit");
				
				//reading input 
				int num=scanner.nextInt();
				
				//creating object of CountDigits class to call its method
			     CountDigits countdigit=new CountDigits();
				
				//invoking method to calculate digits
				int result=countdigit.countDigitOfNumber(num);
				
				//displaying result
				System.out.println("number of digits in  "+num+" is = "+result);
				
	}

}
