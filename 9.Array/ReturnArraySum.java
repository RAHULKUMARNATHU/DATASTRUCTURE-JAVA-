import java.util.Scanner;

public class ReturnArraySum {

    public static int  ArraySum (int arr[]) {
        int totalSum = 0;

        for(int i = 0 ;i<arr.length ; i++){
            totalSum+=arr[i];
        }
        return totalSum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i =0 ; i<n ; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("TotalSum" +" = " +(ArraySum(arr))); 
    }
}
