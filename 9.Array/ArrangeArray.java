/*Arrange Numbers In Array
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2. 
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Explanation of Sample Input 1 :
Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, 
then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.*/


import java.util.Scanner;

public class ArrangeArray {
    public static int[] arrangeArray(int arr []){
       
        int newArray [] =  new int[arr.length];
        int left =0;
        int right = arr.length-1;
        while (left<= right){
            for( int i =0 ; i<arr.length ; i++){
                if(arr[i] %2 ==1){
                    newArray[left] = arr[i];
                    left++;
                }else{
                    newArray[right] = arr[i];
                    right--;
                }

            }
        }



        return newArray; 
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
         int n = sc.nextInt();
         int arr[] = new int [n];
         for(int i =0 ;  i < n ; i++){
            arr[i] = sc.nextInt();            
         }
         int currentArray [] = arrangeArray(arr);
         
         for( int i = 0 ; i < currentArray.length ; i++){
            System.out.print(currentArray[i] +" ");
        }
    

}
}
