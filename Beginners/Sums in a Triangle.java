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
		    int[][] arr = new int[n][n];
		    for(int row = 0;row < n;row++){
		        for(int col = 0;col < row + 1;col++){
		            arr[row][col] = sc.nextInt();
		        }
		    }
		    for(int row = n-2;row >= 0;row--){
		        for(int col = 0;col<row+1;col++){
		            arr[row][col] += Math.max(arr[row+1][col],arr[row+1][col+1]);
		        }
		    }
		    System.out.println(arr[0][0]);
		}
	}
}
