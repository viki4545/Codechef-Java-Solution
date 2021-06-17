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
		
		for(int i=0;i<testCases;i++){
		    int num = sc.nextInt();
		    int reverse = 0;
		    while(num != 0){
		        //in this step we get the remainder as a last number
		        int remainder = num%10;
		        //in this step we get the reverse number
		        reverse = reverse*10+remainder;
		        //we want to eliminate the no which was reversed
		        num = num/10;
		    }
		    System.out.println(reverse);
		}
	}
}
