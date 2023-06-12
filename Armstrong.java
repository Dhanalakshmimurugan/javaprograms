package interviewpreparation;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		        int number = 153;
		        int originalNumber = number;
		        if (originalNumber == number) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
		    }
	public boolean num (int number) {
		        while (number > 0) {
		            int digit = number % 10;
		            int result1 = 0;
		            result1=result1*digit*digit*digit;
		            number=number/10;  
		        }
		        return true;	
         }
      }


        
		
