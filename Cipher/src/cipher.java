//Assignment 1 - Cipher
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner; 
import java.util.Random; 

public class cipher {

	public static void main(String[] args) {
		
		Random generator = new Random(); 
		Scanner scan = new Scanner(System.in); 
		
		int key = generator.nextInt(10); 
		
		int num1; 
		int num2; 
		int num3; 
		int num4; 
		int num5; 
		
		System.out.println ("Please enter 5 numbers in the range of 0 to 19 down below:"); 
		
		//************************************** 1st Number **************************************//
		System.out.println("1st Number: ");
		num1 = scan.nextInt(); 
		
		//If 1st number is outside of limit
		if(0 > num1 | num1 > 19) {
			System.out.print("Please read directions and try again!"); 
			scan.close();
			System.exit(0); 
		}
		
		//************************************** 2nd Number **************************************//
		System.out.println("2nd Number: ");
		num2 = scan.nextInt(); 
				
		//If 2nd number is outside of limit
		if(0 > num2 | num2 > 19) {
			System.out.print("Please read directions and try again!"); 
			scan.close();
			System.exit(0); 
		}
				
		//************************************** 3rd Number **************************************//
		System.out.println("3rd Number: ");
		num3 = scan.nextInt(); 
				
		//If 3rd number is outside of limit
		if(0 > num3 | num3 > 19) {
			System.out.print("Please read directions and try again!"); 
			scan.close();
			System.exit(0); 
		}
				
		//************************************** 4th Number **************************************//
		System.out.println("4th Number: ");
			num4 = scan.nextInt(); 
				
		//If 4th number is outside of limit
		if(0 > num4 | num4 > 19) {
			System.out.print("Please read directions and try again!"); 
			scan.close();
			System.exit(0); 
		}
		
		//************************************** 5th Number **************************************//
		System.out.println("5th Number: ");
			num5 = scan.nextInt(); 
				
		//If 5th number is outside of limit
		if(0 > num5 | num5 > 19) {
			System.out.print("Please read directions and try again!"); 
			scan.close();
			System.exit(0); 
		}
		
		//************************************** End of five numbers **************************************//
		scan.close();
		
		//Sum 5 numbers and store in a variable
		int sum = (num1 + num2 + num3 + num4 + num5); 
		
	}

}
