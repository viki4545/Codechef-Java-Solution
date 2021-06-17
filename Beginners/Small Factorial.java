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
		for(int i = 0;i<testCases;i++){
		    int fact = 1;
		    int n = sc.nextInt();
		    for(int j = 1;j<=n;j++){
		        fact = fact * j;
		    }
		    System.out.println(fact);
		}
	}
}
