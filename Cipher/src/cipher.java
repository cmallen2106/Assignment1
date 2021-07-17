//Assignment 1 - Cipher
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner; 
import java.util.Random; 

public class cipher {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
				
		int num1; //user inputed number
		int num2; //user inputed number
		int num3; //user inputed number
		int num4; //user inputed number
		int num5; //user inputed number
		int encodedDigit1; //Corresponding to tens digit
		int encodedDigit2; //Corresponding to ones digit
		int finalTotal; //Corresponding to ones digit
		
		
		//Program Header
		System.out.println("Programming Fundamentals"); 
		System.out.println("Name: Christina Sosa"); 
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println(); //adding extra line space
		
		//Ask user for 5 numbers
		System.out.println("Welcome to the Cipher program"); 
		System.out.println ("Please enter 5 numbers between 0 and 19"); 
		
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
		
		System.out.println(); //adding extra line space
		//Sum 5 numbers and store in a variable
		int Total = (num1 + num2 + num3 + num4 + num5); 
		System.out.println("Total = " + Total); 
		
		//Random generator 0-9
		Random rand = new Random(); 
		int rand_int = rand.nextInt(10); 
		System.out.println("Your random key is: " + rand_int); //Display key to user
		
		//Encode each digit of plaintext separately using Caesar Code
		encodedDigit1 = ((Total / 10) + rand_int) % 10; //Corresponding to tens digit
		finalTotal = (Total / 10) * 10; //Corresponding to ones digit
		encodedDigit2 = ((Total - finalTotal) + rand_int) % 10; //Corresponding to ones digit
		
		//Output final encoded number 
		System.out.println("Your encoded number is " + encodedDigit1 + encodedDigit2); 
		
	}

}
