//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-26-2021
//Class - 2nd Period
//Lab  - StringLength

import static java.lang.System.*;

public class StringLengthCheck
{
	String wordOne, wordTwo;

	public StringLengthCheck()
	{
			wordOne = "";
    wordTwo = "";
   
   }

	public StringLengthCheck(String one, String two)
	{
	wordOne = one;
    wordTwo = two;
   
   }

	public void setWords(String one, String two)
	{
	wordOne = one;
    wordTwo = two;
   
   }

	public boolean checkLength( )
	{
		
		

    if(wordOne.length() == wordTwo.length())
    {
      return true;
    }

		return false;
	}

   
   

	public String toString()
     	{
		

    if(checkLength())
    {
      return wordOne + " HAS the same # of letters as " + wordTwo + "\n";
    }
		return wordOne + " does NOT have the same # of letters as " + wordTwo + "\n";
	}

}