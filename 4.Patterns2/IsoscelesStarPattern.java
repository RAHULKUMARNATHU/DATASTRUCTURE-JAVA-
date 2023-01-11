/*
 Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.
...*
..***
.*****
*******


Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
 */
import java.util.Scanner;

public class IsoscelesStarPattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int i =1;
         while(i<=n){

            int spaces =1;
            while(spaces<= n-i){
                System.out.print(" ");
                spaces++;
            }

            int star = 1;
            while(star<=i){
                System.out.print("*");
                star++;
            }

            int dec = i-1;
            while(dec>=1){
                System.out.print("*");
                dec--;
            }
            System.out.println();

            i++;
         }
    }
   
}
