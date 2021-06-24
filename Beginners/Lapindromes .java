				//by one counter array approach


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
       static final int MAX_CHAR = 26;
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            String str = new String();
            str = sc.next();
            if(isLapindrome(str) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            testCases--;
        }
    }

    public static boolean isLapindrome(String str){
        int[] count = new int[MAX_CHAR];
        int n = str.length();

        for(int i = 0, j = n-1; i < n/2; i++, j--){
            count[str.charAt(i) - 'a']++;
            count[str.charAt(j) - 'a']--;
        }

        for(int i = 0; i < MAX_CHAR; i++){
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
	
}
