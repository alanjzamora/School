//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-24-2021
//Class - 2nd Period
//Lab  - Social Security

import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		
      Social test = new Social();

		test.setWord("456-56-234");
		test.chopAndAdd();
		System.out.println(test);
      
      
      test.setWord("1-1-1");
		test.chopAndAdd();
		System.out.println(test);

		test.setWord("102-2-12");
		test.chopAndAdd();
		System.out.println(test);

		test.setWord("0-0-0");
		test.chopAndAdd();
		System.out.println(test);
      
      //add test cases
		
	}
}