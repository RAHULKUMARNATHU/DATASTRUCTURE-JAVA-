import java.util.Scanner;

/*Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
 Integer N
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)

Sample Input 1:
1234
Sample Output 1:
6 4 

Explanation for Input 2:
For the given input, the even digits are 2, 2 and 4 and if we take the sum of these digits it will come out to be 8(2 + 2 + 4) and similarly, if we look at the odd digits, they are, 5, 5 and 5 which makes a sum of 15(5 + 5 + 5). Hence the answer would be, 8(evenSum) <single space> 15(oddSum)
*/


public class SumOfEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even =0;
        int odd =0;
        while(n!=0){
            int rem = n %10;
            if(rem%2 ==0){
                even+=rem;
            }
            else{
                odd += rem;
            }
            n/=10;
            System.out.println(n);
        }
        System.out.println(even +" "+ odd);
    }
}
