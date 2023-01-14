/*
 Palindrome number
Send Feedback
Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
 */

import java.util.Scanner;

class CheckPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int check = n ;
        int rev =0;
        while(n != 0){

            int rem = n%10;
            n/=10;
            rev = rev*10+rem; 
            System.out.println(rev);
        }
        if(rev == check){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}