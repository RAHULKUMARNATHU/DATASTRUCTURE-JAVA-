import java.util.Scanner;

public class CheckPrimality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 2 ;


        boolean isPrime = true;

        if(n%div == 0){
            isPrime = false;
        }

        while(isPrime && div <= n-1){
            if(n%div == 0 ){
                isPrime =false;
         
            }
               div += 1;
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Complex");
        }


        
    }
}
