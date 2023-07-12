import java.util.Scanner;

public class PrintNaturalNumber{
    public static void printNaturalNumber(int n){
        if(n > 1)
           printNaturalNumber(n-1);
           System.out.print(" "+ n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNaturalNumber(n);
    }
}


