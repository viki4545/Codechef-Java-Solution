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
        for(int i = 0;i < testCases;i++){
            int num = sc.nextInt();
            //count variable for storing num of occurence
            int count = 0;
            //convert the int variable to String variable for counting the num of occurence of 4
            String str = Integer.toString(num);
            for(int j = 0;j < str.length();j++){
                if (str.charAt(j) == '4'){
                    count++;
                }
            }
            System.out.println(count);
        }
     }
     }

