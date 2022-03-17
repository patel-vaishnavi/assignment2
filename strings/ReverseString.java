package strings;

import java.util.Scanner;

public class ReverseString {
    //reverse the given input string and return it
	public String reverseTheString(String string) {
	            int i,j;
	           //to get the length of string
	            j=string.length(); 
	         
	            char rev[]= string.toCharArray();
	        
	              char temp;
	            //reversing the array
	          for(i=0,j=j-1;i<j;i++,j--) {
	        	  temp=rev[i];
	        	  rev[i]=rev[j];
	        	  rev[j]=temp;
	        	  
	          } 
	       //creating object of string to return result
           String result=new String(rev);
	        
           return result;
	            
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of scanner class to read input
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("enter the string");
				
				//reading input 
				String input=scanner.next();
               
				 //creating object of IsPrime class to call its method
				ReverseString reversestring=new ReverseString();
				
				//invoking method to reverse input
				String result = reversestring.reverseTheString(input);
				
				//displaying result
				System.out.println("reverse of "+input+" is = "+result);
	}

}
