
/*You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
 *Note:
Given array/list can contain duplicate elements. `
Sample Input 1:

9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7 
 */


import java.util.Scanner;

public class FindPairSum {

    public static int  totalPairSum(int arr [] , int x){
        int n = arr.length;
        int count=0;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    count+=1;
                }
            } 
        }return count;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr [] = {1 ,3 ,6 ,2 ,5 ,4, 3, 2, 4};
       System.out.println(totalPairSum(arr, x));
      
    }
}
