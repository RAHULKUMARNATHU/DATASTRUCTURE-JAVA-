/*Check AP
Send Feedback
Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false
 */

import java.util.Scanner;

public class CheckAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int current = sc.nextInt();
        int diff = current - prev;
       
        while( n >2){
             prev = current;
            current =sc.nextInt();
            int differ =current - prev;
            if(differ != diff){
                System.out.println(false);
                return ; 
            }
            // prev = current;
            n--;
        }
        System.out.println(true);
    }
}
