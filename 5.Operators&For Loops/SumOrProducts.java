/*
Sum or Product
Send Feedback
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Input format :
Line 1 : Integer N
Line 2 : Choice C
Output Format :
 Sum or product according to user's choice
Constraints :
1 <= N <= 12
Sample Input 1 :
10
1
Sample Output 1 :
55
 */

import java.util.Scanner;

class SumOrProducts{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int c = sc.nextInt();

       
           switch(c){
            case (1):
            int sum =0;
             for( int  i =  1 ; i<=n ; i++ ){
                sum +=i; 
             }
             System.out.print(sum);
             break;

              case (2):
            int multiple =1;
             for( int  i = 1 ; i<=n ; i++ ){
                multiple *=i; 
             }
             System.out.print(multiple);
             break;
            default:

            System.out.println(-1);
           }
           

        }

    }
