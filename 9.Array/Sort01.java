/*Sort 0 1
Send Feedback
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
 Write a function to sort this array/list. Think of a solution which scans the array/list only once 
 and don't require use of an extra array/list.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
 



Sample Input 1:
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
*/






import java.util.Scanner;

public class Sort01 {

    // public static void sortZeroesAndOne(int arr []  ){
    //     int count =0 ;
    //     int length =arr.length;

    //     for( int  i = 0 ; i<length ; i++){
    //         if(arr[i] ==1){
    //             count++;
    //         }
    //     }


    //     for( int i =0 ; i<length; i++){
    //         if(i<length-count){
    //             arr[i] = 0;
    //         }
    //         else{
    //             arr[i] =1;
    //         }
    //     }

    // }

    public static void sortZeroesAndOne(int arr[]){
        int length = arr.length ;

        int nextZero  =  0;

        for( int i =0 ; i < length ; i++){
            if(arr[i] ==  0){
                int temp = arr[nextZero];
                arr[nextZero] =arr[i];
                arr[i] =temp;
                nextZero +=1;

            }
        }
    }

    public static void printArray(int arr []){
        for( int  i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {1 ,0 ,1 ,1 ,0 ,1, 0 ,1};
        sortZeroesAndOne(arr );
        printArray(arr);
    }
}
