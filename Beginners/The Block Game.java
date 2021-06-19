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
		    int n = sc.nextInt();
		    int reversed = 0,temp = n;
		    while(temp != 0){
		        reversed = reversed * 10 + temp%10;
		        temp = temp/10;
		    }
		    if(reversed == n){
		        System.out.println("wins");
		    }else{
		        System.out.println("loses");
		    }
		}
	}
}
