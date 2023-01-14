/*Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
 */


import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
        
         int placeValue =1;
         int res = 0 ;

         while(n!=0){
            int rem = n%10;
            n /=10;
            res += placeValue*rem ;
            placeValue*=2;
         }
         System.out.println(res);
    }
}
