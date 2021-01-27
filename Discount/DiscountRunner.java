//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-13-2021
//Class -2nd period
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		
     Scanner keyboard = new Scanner(System.in);

    out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
      double discountedBill = Discount.getDiscountedBill(amt);

	  out.println("Bill after discount :: " + discountedBill);



	}
}