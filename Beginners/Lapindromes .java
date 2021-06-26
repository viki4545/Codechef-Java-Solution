				//by one counter array approach


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
      //maximum character
       static final int MAX_CHAR = 26;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            //we have to take the string object to take input as a character
            String str = new String();
            str = sc.next();
            //if user input is lapindrome then it will print yes or it will print no.
            if(isLapindrome(str) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            testCases--;
        }
    }

    public static boolean isLapindrome(String str){
        //we have to taken only the one character array of size 26
        int[] count = new int[MAX_CHAR];
        int n = str.length();
        //we have to iterate the ith loop from 0 to n/2(from left to right)
        //and  jth loop from n-1 to n/2(from right to left)
        for(int i = 0, j = n-1; i < n/2; i++, j--){
            count[str.charAt(i) - 'a']++;
            count[str.charAt(j) - 'a']--;
        }
        //we iterate the loop from 0th index to last index in the array then it will check
        //if the count of ith index is not equal to zero the it will return as false 
	//or it will return true
        for(int i = 0; i < MAX_CHAR; i++){
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
