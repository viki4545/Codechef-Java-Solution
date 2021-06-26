				//by two counter array approach

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases --> 0){
		    //we have to take the string object to take input as a character
		    String str = new String();
		    str = sc.next();
		    int len = str.length();
		    int[] left = new int[26];
		    int[] right = new int[26];
		    	
			//we have taken left array to iterate through 0th to mid(len/2) index
		        for(int i = 0;i<len/2;i++){
		            left[str.charAt(i) - 'a']++;
		        }

		        //we have taken right array to iterate throught len+1/2(mid+1) to last index
		        for(int i = (len+1)/2;i<len;i++){
		            right[str.charAt(i) - 'a']++;
		        }

		        boolean flag = true;
			//we iterate the array from left to right to check if left is not equal to 				//right then it will return false or it will return true
		        for(int i = 0;i<26;i++){
		            if(left[i] != right[i])
		              flag = false;
		        }

		    if(flag == true)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
