import java.util.Scanner;

/*Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4

...1
..12
.123
1234

The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */
public class MirrorImageNumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        
        while(i<=n){
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(" ");
                spaces++;
            }
            
            int j =1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
        i++;
        System.out.println();
        }
       
    }
}
