import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n  = sc.nextInt();

         for( int i = 2 ; i <n ; i++ ){
            Boolean isPrime =true ;
            for(int j =2 ; j<=i/2 ; j++){
                if(i%j == 0){
                    isPrime = false ;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
         }
    }
}
