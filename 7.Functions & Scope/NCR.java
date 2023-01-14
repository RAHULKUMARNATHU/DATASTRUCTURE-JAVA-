/*
 Find NcR
 */


import java.util.Scanner;

class NCR {


    public static int  factorial(int n ) {
        int ans = 1;
        for( int i =n ; i>=1 ; i--){
            ans *= i;
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int r = sc.nextInt();

        int factN =factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);

        int res = factN / (factNR*factR);


        System.out.println( res);
    }
}