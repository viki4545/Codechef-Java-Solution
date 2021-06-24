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
		for(int i = 0;i < testCases;i++){
		    float hra = 0;
		    float da = 0;
		    float salary = sc.nextInt();
		    if(salary > 1500){
		        hra = 500;
		        da = (salary/100) * 98;
		    }else{
		        hra = (salary/100) * 10;
		        da = (salary/100) * 90;
		    }
		    double grossSalary = salary + hra + da;
		    System.out.format("%.2f",grossSalary);
		    System.out.println();
		}
	}
}
