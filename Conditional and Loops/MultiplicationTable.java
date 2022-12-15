import java.util.Scanner;

/*Write a program to print multiplication table of n

Sample Input 1 :
2

Sample Output 1 :
2
4
6
8
10
12
14
16
18
20
 */

 public class MultiplicationTable{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=10){
            System.out.println(n*i);
            i+=1;
        }

    }
 }
