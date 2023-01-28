/*Code Merge Two Sorted Arrays
Send Feedback
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
 merge them into a third array/list such that the third array is also sorted.
Sample Input 1 :

1 3 4 7 11

2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13  */

public class MergeSort {
    public static void printArray(int resArray[]){
        for( int i = 0 ; i< resArray.length ; i++){
            System.out.print( resArray[i] +" ");
        }

    }
    public static int [] mergeSort(int arr [] , int arr1[]){
        int n = arr.length;
        int m =arr1.length;
        int resArray []  = new int[n+m];
        int i = 0 ;
        int j = 0;
        int k =0;
        while(i<n && j < m){
            if(arr[i]<=arr1[j]){
                resArray[k] =arr[i];
                i++;
                k++;
            }else{
                resArray[k]= arr1[j];
                j++;
                k++;
            }
        }



        while(i<arr.length){
            resArray[k]=arr[i];
            i++;
            k++;
        }
        while(j<arr1.length){
            resArray[k] =arr1[j];
            j++;
            k++;
        }
        return resArray;
    }
    public static void main(String[] args) {
        int arr []= {1 ,3 ,4, 7,11 };
        int arr1 [] = {2, 4, 6, 13};
        int resArray[] = mergeSort(arr , arr1);
        printArray(resArray);
    }
}
