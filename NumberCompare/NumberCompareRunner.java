//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-20-2021
//Class - 2nd Period
//Lab  - NumberCompare

import static java.lang.System.*;
import java.util.Scanner;


public class NumberCompareRunner
{
	public static void main( String args[] )
	{


		
	    NumberCompare test = new NumberCompare(5,6);
	    out.println(test); 
	    out.println("largest == "+ test.getLargest());
	    out.println("smallest == "+ test.getSmallest()+"\n\n");

      int test1;
      int test2;

      Scanner keyboard = new Scanner(System.in);

        System.out.print("Number 1 :: ");
        test1 = keyboard.nextInt();

        System.out.print("Number 2 :: ");
        test2 = keyboard.nextInt();

        System.out.println();
        
        test.setNums(test1, test2);
        out.println(test);
        out.println("largest == "+ test.getLargest());
  	    out.println("smallest == "+ test.getSmallest()+"\n\n");
      
        //add more test cases
      }




	}
