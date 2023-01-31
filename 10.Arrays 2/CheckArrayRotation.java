/*Check Array Rotation
Send Feedback
You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and
 then rotated by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K', 
that means, the index from which the array/list has been rotated.

Sample Input 1:
5 6 1 2 3 4
Sample Output 1:
2
*/

public class CheckArrayRotation {
    public static int checkArrayRotation(int arr []){
        for( int  i = 0 ; i< arr.length ; i++){
            if(arr[i]>arr[i+1]){
                return i+1 ;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {5, 6, 1 ,2 ,3 ,4};
       System.out.println(checkArrayRotation(arr));
    }
}
