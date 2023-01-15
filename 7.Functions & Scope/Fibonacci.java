/*
Fibonacci Number
Send Feedback
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
 */


import java.util.Scanner;

public class Fibonacci {


    public static boolean checkFibonacci(int n ) {
        int a = 0 ;
        int b = 1;

        while(a<=n){
            int res = a+b;
            a=b;
            b=res;
            if(res == n){
                return true ;
            }
           
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkFibonacci(n));
    }
}
