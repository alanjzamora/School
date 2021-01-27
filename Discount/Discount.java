//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-13-2021
//Class - 2nd period
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	 	public static double getDiscountedBill(double bill)
   		{
         if(bill < 2000)
    {
      return bill;
    }
		if (bill >= 2000)
    {
      return bill*.85;
    }
	}
   
   
   




