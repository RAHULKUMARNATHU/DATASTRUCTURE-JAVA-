/*Code Insertion Sort
Send Feedback
Provided with a random integer array/list(ARR) of size N,
 you have been required to sort this array using 'Insertion Sort'.
 
  Note:
Change in the input array/list itself.
 You don't need to return or print the elements.

 Sample Input 1:
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
*/

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void insertionSort(int arr[]){
        for( int  i = 1 ; i<arr.length ; i++){
            // Insert element in sorted portion
            int  j  = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp ){
                arr[j+1] = arr[j];
                j--;
            }           
        arr[j+1] =temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {2 ,13 ,4, 1 ,3, 6, 28};
        insertionSort(arr);
        printArray(arr);

    }
}
