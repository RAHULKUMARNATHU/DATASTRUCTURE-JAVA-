/*
 Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
 */

import java.util.Scanner;

public class InterestingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n-1;

        while(i>=0){
            char ch = (char)('A'+i);
            int j =n;
            while(j>i){
                System.out.print(ch);
                ch= (char)(ch+1);
                j--;
            }
            i-=1;
            System.out.println();
        }
    }
}
