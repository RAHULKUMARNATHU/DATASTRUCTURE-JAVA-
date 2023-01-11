import java.util.Scanner;

/*
 * Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines

 */

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int  i = 0;
        while(i <=n ){
            int j =0;
            while (j <i){
                char ch = (char)('A'+i-1);
                
                System.out.print(ch+" ");
            j+=1;
            }
            i+=1;
            System.out.println();
        }
    }
}
