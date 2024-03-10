package code;

import java.util.Scanner;

public class CoreAlgorithmsTwo {

	public static void main(String[] args) {

		/*Prompt for number then prompt for place value 
		 * then program prints digit in given place value spot 
		 * 0=ones 1=tens 2=hundreds...
		 * ex number is 2468 place value is 2 
		 * output is 4
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Please enter the digit you want: ");
		int digit = input.nextInt();
		
		//int because ex 100.0
		number = (number / (int)Math.pow(10, digit)) % 10; //bring to end then abcdef % 10 is f
		
		System.out.println(number);
	}

}
