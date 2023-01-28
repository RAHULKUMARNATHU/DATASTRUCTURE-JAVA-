/*Code Bubble Sort
Send Feedback
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
Note:
Change in the input array/list itself. You don't need to return or print the elements.

Sample Input :
2 13 4 1 3 6 28
Sample Output :

1 2 3 4 6 13 28*/



public class BubbleSort {
    public static void printArray(int arr[]){
        for( int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void bubbleSort(int [] arr){
        for( int i = 0 ;i<arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
    int arr [] = {2, 13, 4, 1, 3, 6, 28};
    bubbleSort(arr); 
    printArray(arr);

    }
}
