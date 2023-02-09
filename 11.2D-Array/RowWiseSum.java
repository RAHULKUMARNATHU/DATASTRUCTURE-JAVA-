/*Row Wise Sum

For a given two-dimensional integer array/list of size (N x M), 
find and print the sum of each of the row elements in a single line,
 separated by a single space.

 Sample Input 1:

4 2 
1 2 
3 4 
5 6 
7 8

Sample Output 1:
3 7 11 15  
*/



import java.util.Scanner;

public class RowWiseSum {
    public static void rowWiseSum(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        
        for( int i = 0 ; i<m ; i++){
            int sum =0;
            for(int j = 0 ; j<n ; j++){

              sum +=arr[i][j];
              System.out.print(arr[i][j]+" ");
                
            }
              System.out.println(": " +sum);
        }        
    }
    
    public static void main(String[] args) {
        int arr1[][] = {{1,2},{3,4},{5,6},{7,8}};
         rowWiseSum(arr1);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int arr [] [] = new int[n][m];

        // for(int i = 0 ;i<n ; i++){
        //     for(int j = 0 ; j<m ; j++){
        //         arr[i][j] =sc.nextInt();
        //     }
        // } 
        //  rowWiseSum(arr);
       
    }
}
