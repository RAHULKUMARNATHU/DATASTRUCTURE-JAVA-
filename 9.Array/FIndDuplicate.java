import java.util.Scanner;

/*Find Duplicate
Send Feedback
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
 */

public class FIndDuplicate {


    public static int getDuplicate(int arr[]){
        int count = 0 ;
       for( int i =0; i<arr.length ; i++){
        for( int  j = 0  ; j < arr.length ; j++){
            if( i == j){
                count =1;
            }
            else if( arr[i] == arr[j]){
            count ++;
            break;
            }
        }
        if(count>1){
            return arr[i];
        }
       }
       
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {0 ,7 ,2 ,5, 4, 7 ,1 ,3 ,6};
        System.out.println(getDuplicate(arr) );
    }
}
