
/*Swap Alternate
Send Feedback
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.
Sample Input 1:
1
6
9 3 6 12 4 32
Sample Output 1 :
3 9 12 6 32 4
 */



import java.util.Scanner;

public class SwapAlternate {

    public static void printArray(int arr[]){
        System.out.print("Result :");
        for( int i =0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] swapAlternate(int arr[]) {
        for( int i = 0 ; i<arr.length-1 ; i+=2){
          int j =i+1;
          int temp = arr[j];
          arr[j] =arr[i];
          arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int arr [] = {9 ,3 ,6 ,12 ,4 ,32};
        int resultArray []= swapAlternate(arr);
        printArray(resultArray);

    }
}
