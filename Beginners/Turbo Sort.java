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
		int[] arr = new int[testCases];
		for(int i = 0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
