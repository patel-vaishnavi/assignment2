package number;

public class Fibonacci {
    //return fibonacci series upto given input
	public void fibonacciSeries(int num) {
		      int a=0,b=1,c;
		     
		      while(a<=num) {
		    	 System.out.println(a); 
		    	  c=a+b;
		    	  a=b;
		    	  b=c;
		    	  
		      }
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0,b=1,c;
		while(a<=13) {
	    	 System.out.println(a); 
	    	  c=a+b;
	    	  a=b;
	    	  b=c;
	    	  
	      }
	}

}
