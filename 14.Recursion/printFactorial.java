/*Find factorial */

import java.util.Scanner;

public class PrintFactorial{
    public static int findFactorial(int n ){
        if(n ==0){
            return 1;
        }
       return n * findFactorial(n-1);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = findFactorial(n);
    System.out.println(res);
}
}