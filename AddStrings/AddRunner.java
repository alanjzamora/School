//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Alan Zamora
//Date - 1/7/2021
//Class - Period 2nd
//Lab  - Strings Basics

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		demo.setStrings("sally","sue");
		demo.add();
		out.println(demo);
	
     demo.setStrings("computer" ,"science");
		demo.add();
		out.println(demo);
      
      demo.setStrings("uil", "contests");
		demo.add();
		out.println(demo);
   
   
   }
}