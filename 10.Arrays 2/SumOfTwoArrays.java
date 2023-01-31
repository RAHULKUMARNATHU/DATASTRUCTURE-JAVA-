/*Sum of Two Arrays
Send Feedback
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively.
 Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). 
The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result
 in another array/list i.e. output array/list will also contain only single digit at every index.
 
 Sample Input 1:

6 2 4

7 5 6
Sample Output 1:
1 3 8 0
*/

public class SumOfTwoArrays {
    public static void printArray(int arr[]){
        for( int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] sumOfTwoArrays(int arr1 [] , int arr2 [] ){

        int k = 0;
        int m =arr1.length;
        int n = arr2.length;
        if(m>n){
            k=m+1;
        }else{
            k=n+1;
        }


        int outputArray[] =new int[k];
        int carry =0 ;
        int rem = 0;
        int sum = 0;
        while(m>0&&n>0){
        sum = arr1[m-1]+arr2[n-1] +carry;
        carry = sum/10 ;
         rem = sum %10;

        
        outputArray[k-1] = rem;
        k--;
        m--;
        n--;
        }

        while(m>0){
            sum = arr1[m-1]+carry;
            carry = sum/10;
            rem = sum%10;
            outputArray[k-1] = rem;
            k--;
            m--;


        }

        while(n>0){
            sum =arr2[n-1]+carry;
            carry =sum/10;
            rem = sum%10;
            outputArray[k-1] = rem;
            k--;
            n--;

        }
        outputArray[0] =carry;


        return outputArray;
    }
    public static void main(String[] args) {
        int arr1[] = {6 ,2 ,4 };
        int arr2 []= {7, 5 ,6 ,8};
        int resArray [] = sumOfTwoArrays(arr1 , arr2);
        printArray(resArray);
        
    }
}
