import java.util.Scanner;

/*Code : Reverse Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */

 class RevNumPattern {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while(i<=n){
            int j = i;
            while(j>=1){
                
                System.out.print(j+" ");
                j-=1;

            }
            System.out.println();
            i+=1;

        }
    }
 }