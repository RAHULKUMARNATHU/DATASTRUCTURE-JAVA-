import java.util.Scanner;

/*
Code : Character Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */

public class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
       
        while(i<=n){
            int j =0;
            int k =i;
            while(j<i){
                char  ch = (char)('A'+k-1);
                System.out.print(ch +" ");
                j+=1;
                k++;
            }
            i+=1;
            System.out.println();
        }
    }
    
}
