/*
Square Root (Integral)
Send Feedback
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :
Integer N
Output Format :
Square root of N (integer part only)
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
 */

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n  = s.nextInt();
          int res =0;
       
         for(res = 0 ; res<= n ; res++){
            res +=1;

         }
        /*USing while loop */
        // while(res*res <= n){    
        //     res += 1;    
        // }
        res-=1;
        System.out.println(res);
    }
}
