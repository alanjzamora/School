//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date -  1-18-2020
//Class - 2nd period
//Lab  -Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	word = "";
   
   }

	public StringOddOrEven(String s)
	{
	word = s;
   
   }

	public void setString(String s)
	{
	word = s;
   
   }

 	public boolean isEven()
	{
 		

 		if(word.length() % 2 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
	}
 	
   public String toString()
 	{
 		String output;
      
      
      	if(isEven())
    {
      output = (word + " is even!");
    }
    else
    {
      output = (word + " is odd!");
    }
 		return output;
	}
}