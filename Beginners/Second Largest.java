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
        for (int i = 0; i < testCases; i++) {
            int[] array = new int[3];
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            array[2] = sc.nextInt();
            Arrays.sort(array);
            System.out.println(array[1]);
        }
	}
}
