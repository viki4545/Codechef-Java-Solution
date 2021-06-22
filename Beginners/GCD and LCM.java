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
		while(testCases-->0){
		    long A = sc.nextInt();
		    long B = sc.nextInt();
		    long result = gcd(A,B);
		    long lcm = (A/gcd(A,B))*B;
		    System.out.println(result + " " +lcm);
		}
	}
	
	public static long gcd(long a, long b){
	    if(b == 0) return a;
	    return gcd(b,a%b);
	}
}
