/*Selection Sort
Send Feedback
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 Note:
Change in the input array/list itself. You don't need to return or print the elements.

Sample Input 1:
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
 */

public class SelectionSort {

    public static void printArray(int arr[]){
        for( int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static int [] selectionSort(int arr[]){

        for( int i =0 ; i<arr.length ; i++){
            int min =arr[i];
            for( int j = i+1  ; j<arr.length ; j++){
                if(min>arr[j]){
                    int temp = min;
                    min =arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {2 ,13 ,4 ,1, 3, 6, 28};
        int res [] = selectionSort(arr); 
        printArray(res);
    }
}
