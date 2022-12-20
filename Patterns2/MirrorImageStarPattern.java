
/*/*Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4

...*
..**
.***
****
The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */ 

import java.util.Scanner;

public class MirrorImageStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int i = 1;
        while(i<=n){
            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces+=1;
            }
            int j =1;
            while(j<=i){

                System.out.print("*");
            j++;
            }
            System.out.println();
            i++;
        }
    }
}
