/*Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :

*
*1*
*121*
*12321*
*121*
*1*
*

*/



import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
         System.out.println("*");
        while(i<=n){
           System.out.print("*");
            int j =1 ;
           while(j<=i){

            System.out.print(j);
            j++;
           }

           int dec = j-2;
           while(dec>=1){
            System.out.print(dec);
            dec--;
           }

 
            System.out.println("*");
            i++;
        // System.out.println();
        }


        //    Second Half

        i = n-1;
        while(i>=1){
            System.out.print("*");
            int j =1;
            while(j<=i){
                System.out.print(j);
                j++;
            }

            int dec = j-2;
            while(dec>=1){
                System.out.print(dec);
                dec--;
            }
            i--;
            System.out.println("*");

        }
        System.out.print("*");
    }
}
