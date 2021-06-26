/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int gcd(int a , int b){
        if(a == 0)return b;
        if(b == 0)return a;
        if(a>b){
            return gcd(b,a%b);
        }else{
            return gcd(a,b%a);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
		    int ans;
		    //we have to take n as the no of recipe
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    //this loop will store the no of recipe in the integer array at a particular index
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    //it will find the gcd of the first pair in the array
		    ans = gcd(arr[0],arr[1]);
		    //then it will find the remaining pair gcd
		    for(int i = 2;i<n;i++){
		           ans = gcd(ans,arr[i]);
		    }
		    //then we divide the no of recipe with gcd to give the output
		    for(int i = 0;i<n;i++){
		        System.out.print(arr[i]/ans + " ");
		    }
		    System.out.println(" ");
		}
		
	}
}
