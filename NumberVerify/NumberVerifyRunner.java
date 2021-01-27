//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-14-2021
//Class - 2nd period
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;



public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		
      //add in input
	
		Scanner keyboard = new Scanner(System.in);

		
      out.print("Enter a whole number :: ");

  	
  		int num = keyboard.nextInt();



  		System.out.println(num + " is odd  :: " + NumberVerify.isOdd(num));
  		System.out.println(num + " is even :: " + NumberVerify.isEven(num));

  		
  		System.out.println();
    
		
		// add in more test cases




	}
}