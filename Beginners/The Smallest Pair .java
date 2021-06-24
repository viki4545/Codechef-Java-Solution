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
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0;i < n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int first = arr[0];
		    int second = arr[1];
		    int sum = first + second;
		    System.out.println(sum);
		}
	}
}
