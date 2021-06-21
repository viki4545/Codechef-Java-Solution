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
		int arr[] = {100,50,10,5,2,1};
		while(testCases-->0){
		    int n = sc.nextInt();
            int count = 0;
            for(int i=0;i<arr.length;i++){
            count += n/arr[i];
            n %= arr[i];
            }
            System.out.println(count);
		}
	}
}
