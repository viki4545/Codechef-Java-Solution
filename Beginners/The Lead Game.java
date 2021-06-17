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
        int[] player1 = new int[testCases];
        int[] player2 = new int[testCases];
        int lead = 0, winner = 0, pScore1 = 0, pScore2 = 0;
        for (int i = 0; i < testCases; i++) {
            player1[i] = sc.nextInt();
            player2[i] = sc.nextInt();

            pScore1 += player1[i];
            pScore2 += player2[i];
        if(pScore1 > pScore2 && pScore1-pScore2 > lead){

            lead = pScore1 - pScore2;
            winner = 1;
            }
            if(pScore2 > pScore1 && pScore2-pScore1 > lead){

                lead = pScore2  - pScore1;
                winner = 2;
            }
    }
        System.out.println(winner+" "+lead);
	}
}
