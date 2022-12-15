import java.util.Scanner;

/*Find power of a number
Send Feedback
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)

Sample Input 1 :
 3 4
Sample Output 1 :
81

*/

public class PowerOfNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int res = 1;

    while (x > 0) {
       res *= n;

        x -= 1;
    }
    System.out.println(res);
   } 
}
