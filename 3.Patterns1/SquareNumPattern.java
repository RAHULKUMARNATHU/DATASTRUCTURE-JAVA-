import java.util.Scanner;

/*
  Code : Square Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines

Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777
 */

public class SquareNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;

        while(i<n){
            int j =0;
            while(j<n){
                System.out.print(n +" ");
            j+=1;
            }
            System.out.println();
            i+=1;

        }
    }
}
