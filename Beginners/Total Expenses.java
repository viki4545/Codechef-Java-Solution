/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases --> 0){
		    double quantity = sc.nextInt();
		    double price = sc.nextInt();
		    double expenses = quantity*price;
		    if(quantity > 1000){
		        expenses = expenses - ((quantity*price/100)*10);
		    }
		    System.out.println(expenses);
		}
	}
}
