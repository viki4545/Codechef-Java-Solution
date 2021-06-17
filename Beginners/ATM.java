/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double amt = sc.nextDouble();
		double balance = sc.nextDouble();
		if(amt%5 == 0 && (amt + 0.50) <= balance){
		    System.out.println(balance - (amt + 0.50));
		}else{
		    System.out.println(balance);
		}
	}
}
