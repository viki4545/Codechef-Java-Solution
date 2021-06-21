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
		    int p = sc.nextInt();
		    int count = 0;
		    for(int i = 2048;i!=0;i = i/2){
		        count += p/i;
		        p %= i;
		    }
		    System.out.println(count);
		}
	}
	

}
