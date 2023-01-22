
/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
 */
import java.util.Scanner;

public class FindUnique {
    
    public static int  getUnique(int arr[]) {
     
        int count =0;
        for( int i = 0 ; i<arr.length ; i++){
            for( int j = 0 ; j<arr.length ; j++){
                if(i == j){
                    count =1;
                }
                else if(arr[i] == arr[j]){
                    count++;
                    break;
                } 
               
            
            }

            if(count == 1){
                return arr[i];
            }
            
           
        }
        
        return 0;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int arr [] = {2 ,3, 1, 6, 3, 6, 2};
        System.out.print( getUnique(arr));
        

    }
}
