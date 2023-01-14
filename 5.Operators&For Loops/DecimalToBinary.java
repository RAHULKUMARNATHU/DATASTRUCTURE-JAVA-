import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0;
        int placeValue = 1;
        while( n !=0){
            int rem = n % 2; 
            res += placeValue*rem ;
            placeValue*=10;
            n/=2;
        }
        System.out.println(res);

        
    }
}
