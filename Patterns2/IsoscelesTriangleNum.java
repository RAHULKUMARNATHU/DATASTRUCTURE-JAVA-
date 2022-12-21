/*
 Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4

...1
..232
.34543
4567654

The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
 */

import java.util.Scanner;

public class IsoscelesTriangleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){

            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }

            int j =1;
            int p = i;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }



            int dec = i-1;
            int r = p-2;
            while(dec>=1){
                System.out.print(r);
                dec--;
                r--;
            }




            i++;
        System.out.println();
        }
        
    }
}
