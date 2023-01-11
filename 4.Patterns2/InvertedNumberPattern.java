
/*Code : Inverted Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int i =n;
        while (i>=1){
            int num = 1;
            while(num<=i){
                System.out.print(i);
                num+=1;
            }
            int j =1;
            while(j<=n){
                System.out.print("");
                j+=1;
            }

            i-=1;
            System.out.println();
        }
    }
    
}
