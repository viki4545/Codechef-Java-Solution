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
	    int testCases = sc.nextInt();
	    while(testCases --> 0){
	        int b = sc.nextInt();
	        b -= 2;
	        b /= 2;
	        int result =(b*(b+1))/2;
	        System.out.println(result);
	    }
	}
}