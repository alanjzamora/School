//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Alan Zamora
//Date - 1-24-2021
//Class - 2nd Period
//Lab  - Social Security

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	 socialNum = "";
    sum = 0;
   
   }

	public Social(String soc)
	{
	socialNum = soc;
   }


	public void setWord(String w)
	{
	socialNum = w;
    sum = 0;
   
   }

	public void chopAndAdd()
	{
		  String sub1 = socialNum.substring(0, socialNum.indexOf("-"));
        String sub2 = socialNum.substring(socialNum.indexOf("-") + 1, socialNum.lastIndexOf("-"));
        String sub3 = socialNum.substring(socialNum.lastIndexOf("-") + 1);

        int int1 = Integer.parseInt(sub1);
        int int2 = Integer.parseInt(sub2);
        int int3 = Integer.parseInt(sub3);

        sum = int1 + int2 + int3;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}