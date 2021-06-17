/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc  = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0;i < testCases;i++){
		    int num = sc.nextInt();
		    //if we modulus the num by 10 then we get the last digit as remainder.
		    int lastDigit = num%10;
		    // we divide the num by 10 while num is greater than 10 then we get the firstdigit as quotient. 
		    while(num >= 10){
		           num = num/10;
		    }
		    System.out.println(num + lastDigit);
		    
		}
	}
}
