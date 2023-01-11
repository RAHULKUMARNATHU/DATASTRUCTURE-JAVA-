/* 
Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135

 */

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int i =1 ;
        while(i<=n ){
            int j = n ;
            int valueToPrint=2*i-1;
            while(j>0){

                System.out.print(valueToPrint);
                valueToPrint+=2;


                int max = 2*n-1;
                if(max<valueToPrint){
                    valueToPrint =1;
                }
                j--;
            }
            i++;
            System.out.println();
        }

    }
}
