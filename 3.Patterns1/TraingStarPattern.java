import java.util.Scanner;

/*
 
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines

 */

public class TraingStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i< n){
            int j=0;
            while(j<=i){
                System.out.print("*"+" ");
            j+=1;
            }
            System.out.println();
            i+=1;
        }
    } 


}
