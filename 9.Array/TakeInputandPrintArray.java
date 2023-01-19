import java.util.Scanner;

public class TakeInputandPrintArray{

    public static void printArray(int arr[]){
        for(int i= 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");

        }


    }public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [] = new int[n];
    int i =0;
    while(i<n){
        arr[i] = sc.nextInt();
        i++;
    }
    printArray(arr);
}
}