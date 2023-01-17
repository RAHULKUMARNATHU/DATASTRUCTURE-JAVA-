
/*An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.
Input format :
Two spaced integers : n and x
Output format :
Integer part of (Probability * 100). 
Sample Input 1 :
3 1
Sample Output 1:
42 */

import java.util.Scanner;

public class Probability {


public static int findFactorial(int n ){
    int factorial =1;
    while(n>=1){
        factorial*=n;
        n--;
    }
    return factorial;
}

    public static int  findProbability(int n , int x) {
        
        
        double total = findFactorial(8)/(findFactorial(8-n)*findFactorial(n)); // 8cn
        double redBall = findFactorial(4) / (findFactorial(4-x)*findFactorial(x)); //4cx
        double notRedBall = findFactorial(4) / (findFactorial(4-n+x)*findFactorial(n-x)); //4c(n-x)

        double ans = ( double) (redBall*notRedBall)/total;
        return (int )(ans*100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(findProbability(n , x));
        System.out.println(findFactorial(n));
    }
}


