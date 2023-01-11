/*
  Nth Fibonacci Number
Send Feedback
Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
The first line of each test case contains a real number ‘N’.
Output Format :
For each test case, return its equivalent Fibonacci number
 */


import java.util.Scanner;

class NthFibonacci{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        int next = 0 ; 
        for( int i = 1 ; i <n ; i ++){
            next = a+b;
            a =b ;
            b =next ; 
        }
        System.out.print(next);



    }
}












