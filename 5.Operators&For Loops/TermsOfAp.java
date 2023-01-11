/*
Terms of AP
Send Feedback
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41 
*/


import java.util.Scanner;

class TermsOfAp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1 ;
        int res = 0;      
        for(int i = 1 ; i<=n ; i++){
        res = 3*temp+2;
         temp+=1;         
        if(res%4 ==0 ){
           i-=1;    
           continue;
        }     
        System.out.print(res + " ");
        }

    }
}