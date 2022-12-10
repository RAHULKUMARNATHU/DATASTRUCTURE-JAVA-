
/*1+2+3+4+.....+n */
import java.util.*;

public class SumOfN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i = i+1;
        }
        System.out.print("Sum Of N : " +sum);
        


    }
}