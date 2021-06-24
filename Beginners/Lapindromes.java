				//by two counter array approach

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
		    String str = new String();
		    str = sc.next();
		    int len = str.length();
		    int[] left = new int[26];
		    int[] right = new int[26];
		    
		        for(int i = 0;i<len/2;i++){
		            left[str.charAt(i) - 'a']++;
		        }
		        
		        for(int i = (len+1)/2;i<len;i++){
		            right[str.charAt(i) - 'a']++;
		        }
		        
		        boolean flag = true;
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
