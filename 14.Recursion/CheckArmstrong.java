import java.util.Scanner;

public class CheckArmstrong {
    static int rem =0 , sum = 0;
    public static int checkArmstrong(int n ){

        if(n > 0){
        rem = n %10;
        sum +=rem*rem*rem; 
        checkArmstrong(n/10);
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int res = checkArmstrong(n);
        if(res == n){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong");
        }
    }
}
