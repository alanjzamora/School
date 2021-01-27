//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-18-2021
//Class - 2nd period
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
  
   StringOddOrEven test = new StringOddOrEven();
    String word;
   
   out.print("Enter a word :: ");
   
   
   word = keyboard.nextLine();
   
   test.setString(word);
   
   out.println(test.toString());
   }
}