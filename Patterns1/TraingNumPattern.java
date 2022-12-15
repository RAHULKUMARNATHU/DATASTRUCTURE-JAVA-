import java.util.Scanner;

/*Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
22
333
4444

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */
public class TraingNumPattern {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int i = 1 ;
         while(i<= n){
            int j = 1;
            while(j<=i){
                System.out.print(i+" ");
                j+=1;
            }
            System.out.println();
             i+=1;
         }
        
    }
}
