import java.util.Scanner;

public class EvenOdd{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  =  sc.nextInt();
    int rem = n%2;


    if(rem!=0){
        System.out.println("ODD Number");
    }else{
        System.out.println("EVEN Number" );
    }

  
}
}