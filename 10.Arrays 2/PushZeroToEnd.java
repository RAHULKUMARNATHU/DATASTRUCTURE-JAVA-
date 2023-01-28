/*Push Zeros to end
Send Feedback
You have been given a random integer array/list(ARR) of size N.
 You have been required to push all the zeros that are present in the array/list to the end of it.
  Also, make sure to maintain the relative order of the non-zero elements.
Note:
Change in the input array/list itself. You don't need to return or print the elements.

You need to do this in one scan of array only. Don't use extra space.

Sample Input 1:
2 0 0 1 3 0 0
Sample Output 1:
2 1 3 0 0 0 0
 Explanation for the Sample Input 1 :
All the zeros have been pushed towards the end of the array/list.
 Another important fact is that the order of the non-zero elements have been maintained as they appear in the input array/list.

*/


public class PushZeroToEnd {
    public static void printArray(int arr []){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static int [] pushZeroToEnd(int arr []){
        int nonZero = 0 ;
         for( int i = 0 ; i< arr.length ; i++){
            if( arr[i] != 0){
                int temp = arr[i];
                arr[i]=arr[nonZero];
                arr[nonZero]=temp;
                nonZero++; 
           
            }
           
         }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {2 ,0 ,0 ,1 ,3 ,0 ,0};
        pushZeroToEnd(arr);
        printArray(arr);
    }
}
