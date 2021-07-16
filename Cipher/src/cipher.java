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
		
		//1st Number
		System.out.println("1st Number: ");
		num1 = scan.nextInt(); 
		
		//If 1st number is outside of limit
		if(0 > num1 | num1 > 19) {
			System.out.print("Please read directions and try again!"); 
			scan.close();
			System.exit(0); 
		}
		
		
	}

}
