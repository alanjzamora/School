//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-22-2021
//Class - 2nd Period
//Lab  - Dictionary

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		    WordsCompare test = new WordsCompare();

	   
      
      
      test.setWords("abe", "ape");
      out.println(test); 
	    out.println();
     
     
      test.setWords("giraffe", "gorilla");
      out.println(test);  
	    out.println();

      test.setWords("one", "two");
      out.println(test);  
	    out.println();

      test.setWords("fun", "funny");
      out.println(test);  
	    out.println();

      test.setWords("123", "19");
      out.println(test);  
	    out.println();

      test.setWords("193", "1910");
      out.println(test);  
	    out.println();

      test.setWords("goofy", "godfather");
      out.println(test);  
	    out.println();

      test.setWords("funnel", "fun");
      out.println(test);  
	    out.println();
      
      //add test cases

	}
}