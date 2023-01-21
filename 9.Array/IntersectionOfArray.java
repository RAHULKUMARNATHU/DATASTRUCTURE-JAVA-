/*Intersection of Two Arrays II
Send Feedback
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)

Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 4 3
10
*/


import java.util.Scanner;

public class IntersectionOfArray{
    public static void getIntersection(int [] arr , int []arr1){
        int n = arr.length;
        int m=arr1.length;
        for( int i = 0 ; i < n ; i++){
            for( int j = 0 ; j<m ;  j++){
                if(arr[i] == arr1[j]){
                System.out.print(arr1[j]+" ");
                    arr[j] =-1;
                    break;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr [] = new int[n];
        for( int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr1 [] = new int [m];

        for( int i =0 ; i<m ;i++){
            arr1[i] = sc.nextInt();
        }
        getIntersection(arr , arr1);
    }
}