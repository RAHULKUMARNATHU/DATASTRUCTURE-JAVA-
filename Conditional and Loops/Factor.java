import java.util.Scanner;

/*Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself 

Sample Input 1 :
8
Sample Output 1 :
2 4


Explanation of Sample Output 2 :
No output as 11 is prime having factors as 1 and 11 only
*/
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=2;
        while(i<=n/2){
            if(n%i==0){
                System.out.print(i +"");
            }

            i+=1;

        }
    }
}
