package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateQuotientandRemainder {

	// Function to compute the quotient of two integers
    public static int computeQuotient(int dividend, int divisor) {
        // TODO: Implement this function
    	
    	
    
    		if(divisor == 0) {
    			
    			throw new ArithmeticException("Division by zero is not allowed.");
    		
    	    	 
    		}else {
    			int res = dividend / divisor;
    			return res;

    		}	
    
    	
    	
    }

    
    // Function to compute the remainder of two integers
    public static int computeRemainder(int dividend, int divisor) {
        // TODO: Implement this function
    	
    	
    	
    		if(divisor == 0) {
    			throw new ArithmeticException("Division by zero is not allowed.");

    			
    		}else {
    			int rmdr = dividend % divisor;
    	    	return rmdr;
    		}	
    		
    	

    	
    	
    }
    
    

    // Function to return both quotient and remainder as an array
    public static int[] getQuotientAndRemainder(int dividend, int divisor) {
        // TODO: Implement this function
    	
    	int quotient= computeQuotient(dividend, divisor);
    	int remainder = computeRemainder(dividend, divisor);
    	 return new int[]{quotient, remainder};
    
    }

    
    
    //Main
//    Scanner sc = new Scanner (System.in);
//	
//	 System.out.print("Input: dividend = ");
//	 int num1= sc.nextInt(); 
//	 
//	 System.out.print("Input: divisor = ");
//	 int num2 = sc.nextInt(); 
//	 
//
//	 int[] result = CalculateQuotientandRemainder.getQuotientAndRemainder(num1,num2);
//
//	 
//	 System.out.println("Input: dividend: " + num1);
//	 System.out.println("Input: divisor: " + num2);
//	 System.out.println("Output:" + Arrays.toString(result));
//	
}
