/* package codechef; // don't place package name! */

import java.util.*;
import java.math.*;
class Codechef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase-->0){
            int num = sc.nextInt();
            System.out.println(factorial(num));
        }
    } 
         static BigInteger factorial(int num){
            BigInteger result = BigInteger.ONE;
            for(int i = 1;i<=num;i++){
                result = result.multiply(new BigInteger(String.valueOf(i)));
            }
            return result;          
}
}