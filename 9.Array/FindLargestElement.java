import java.util.Scanner;

public class FindLargestElement{

    public static int  getLargest(int arr[]) {
        int largest = 0;
        for(int i =0 ; i<arr.length ; i++){
            if(largest<arr[i]){
                largest = arr[i];

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];

        for(int i = 0 ; i< n ; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Largest Element is "+" = "+getLargest(arr));

    }
}