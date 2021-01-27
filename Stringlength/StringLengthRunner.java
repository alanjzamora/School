//(c) A+ Computer Science
//www.apluscompsci.com


//Name - Alan Zamora
//Date - 1-26-2021
//Class - 2nd period
//Lab  - StringLength

import static java.lang.System.*;

public class StringLengthRunner
{
	public static void main( String args[] )
	{
		StringLengthCheck test = new StringLengthCheck();
      
      
      test.setWords("hello", "goodbye");
			System.out.println(test);
			System.out.println();
     
      test.setWords("one", "two");
			System.out.println(test);
			System.out.println();

			test.setWords("three", "four");
			System.out.println(test);
			System.out.println();

			test.setWords("TCEA", "UIL");
			System.out.println(test);
			System.out.println();

			test.setWords("State", "Champions");
			System.out.println(test);
			System.out.println();

			test.setWords("ABC", "DEF");
			System.out.println(test);
			System.out.println();

			test.setWords("four", "five");
			System.out.println(test);
			System.out.println();

			test.setWords("whoot", "what");
			System.out.println(test);
			System.out.println();
      
      //add test cases
				
	}
}