//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora             
//Date - 1/7/2021
//Class - Period 2nd
//Lab  - Start and End

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
	  FirstAndLast demo = new FirstAndLast("Hello");
		demo.getFirst();
      demo.getLast();
      out.println(demo);
	   
      
      demo.setString("World");
		demo.getFirst();
      demo.getLast();
      out.println(demo);
      
     demo.setString("Jukebox");
		demo.getFirst();
      demo.getLast();
      out.println(demo);
	
     demo.setString("TCEA");
		 demo.getFirst();
      demo.getLast();
      out.println(demo);
      
     demo.setString("UIL");
		demo.getFirst();
      demo.getLast();
      out.println(demo);
   	
	}
}