//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1/7/2021
//Class - Period 2
//Lab  - Start and End 

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;
   private char firstLetter;
	private char lastLetter;

   
   public FirstAndLast(String s)
	{
	 word = s;
   }

	public void setString(String s)
	{
	word = s;
   }

	public String getFirst()
	{
		 firstLetter = word.charAt(0);
      
      return "" + firstLetter;
	}
	
	public String getLast()
	{
   lastLetter = word.charAt(word.length()-1);
      
      return "" + lastLetter;
	}

 	public String toString()
 	{
 		String output;  
     
      output = "word :: " + word + "\n" + "first letter :: " + firstLetter + "\n" + "last letter :: " + lastLetter + "\n";  
 		
      return output;
	}
}