/*Second Largest in array
Send Feedback
You have been given a random integer array/list(ARR) of size N.
 You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or
 -2 ^ 31(It is the smallest value for the range of Integer) 
 
 Sample Input 1:
2 13 4 1 3 6 28
Sample Output 1:
13*/

import java.util.Scanner;

public class SecondLargest {
    public static int  getSecondLargest(int arr[]){
        int largest =arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for( int i = 0 ; i< arr.length ; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(secondLargest <arr[i] && arr[i]!=largest){
                secondLargest =arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {2 ,13, 4, 1, 3, 6 ,28};
        System.out.println(getSecondLargest(arr));

    }
}
