/*
1234554321
1234**4321
123****321
12******21
1********1
 */


import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        int i = n ;
        while(i>= 1){
            int j = 1 ;
            while(j <= n){
                if(j<=i){

                    System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
                j++;
            }


            int dec =n ;
            while(dec>=1){
                if(dec>i){
                    System.out.print("*");
                }else{
                    System.out.print(dec);
                }
                dec--;
            }
            i--;
            System.out.println();
        }

    }
}
