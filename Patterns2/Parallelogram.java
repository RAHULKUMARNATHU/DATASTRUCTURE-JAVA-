/*Parallelogram Pattern
Send Feedback
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4
****
 ****
  ****
   ****

The dots represent spaces.
Input Format :
 A single integer : N
  */



import java.util.Scanner;

class Parallelogram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = n ;
        while(i> 0 ){
            int j =0 ;
            while(j < n-i){
                System.out.print(" ");
            j++;
            }
            int star = 0;
            while(star<n){
                System.out.print("*");
                star++;
            }


       System.out.println();
       i--;
        }
        
    }
}