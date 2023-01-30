/*Rotate array
Send Feedback
You have been given a random integer array/list(ARR) of size N. 
Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Sample Input 1:
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2 */





import java.util.Scanner;

public class RotateArray {
    public static void printArray(int arr []){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }



/*Best Approach without using extra variable */


    public static void reverseArray(int arr[] , int start , int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }



    public static void rotateArray(int arr[] , int d){
    
        if(arr.length == 0){
            return;
        }
        if(d>arr.length && arr.length!=0){
            d%=arr.length;
        }

        reverseArray(arr , 0 , arr.length-1);
        reverseArray(arr, 0, arr.length-d-1 );
        reverseArray(arr, arr.length-d, arr.length-1);
    }  

/*Using Temp Array  */

    // public static int [] rotateArray(int arr[] , int d){
    //     int tempArray []  =new int [d];
    //     for( int i = 0 ; i< d ;i++ ){
    //         tempArray[i] =arr[i];
    //     }
    //     for(int i = 0 ; i<arr.length-d ;i++){
    //         arr[i] = arr[i+d];
    //     }

    //     for( int i =0 ; i<d ; i++){
    //         arr[arr.length-d+i] =tempArray[i];

    //     }
    //     return arr;
    // }  



    /*Base approach */

    // public static int [] rotateArray(int arr[] , int d){
    //     while(d!=0){
    //         int temp =arr[0];
    //         for( int  i = 0 ; i<arr.length-1 ;i++){
    //             arr[i] =arr[i+1];
    //         }
    //         arr[arr.length-1] = temp;
    //         d--;
    // }
    //     return arr;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int arr [] = {1 , 2, 3, 4, 5, 6 ,7};

        rotateArray(arr , d);
        printArray(arr);
    }
}
