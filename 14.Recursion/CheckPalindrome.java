import java.util.Scanner;

public class CheckPalindrome {
   static int rem =0 , sum=0;

    public static int checkPalindrome(int  n){
       if(n > 0){
        rem = n%10;
        sum = sum*10+rem ;
        checkPalindrome(n/10);
       }
       return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = checkPalindrome(n);
        if(res == n){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }

    }
}
