/*Code Binary Search
Send Feedback
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.

Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1

Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1

 */


import java.util.Scanner;

public class BinarySearch{

    public static int  binarySearch(int arr [] , int ele){
       int start = 0 ;
       int end = arr.length -1 ;

       while(start <= end){
        int mid = (start+end )/2;

        if(arr[mid] < ele){
            start  = mid+1;
        }else if(arr[mid] > ele){
            end = mid -1;
        }else {
            return mid ;
        }
       }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = {1, 2, 3, 4, 5, 6, 7};
        int res = binarySearch(arr, n);
        System.out.println(res);

    }



}