
/*Triplet Sum
Send Feedback
You have been given a random integer array/list(ARR) and a number X. 
Find and return the number of triplets in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements. 


Sample Input 1:
7
1 2 3 4 5 6 7 
12*/


import java.util.Scanner;

public class TripletSum {
    public static int getTripletSum(int [] arr , int x){
        int length =arr.length;
        int count =0;
        for( int  i = 0 ; i <length ; i++){
            for(int j = i+1 ; j<length ;j++){
                for( int k = j+1;k<length ; k++ ){
                    if(arr[i]+arr[k] +arr[j] == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  arr [] = {2, -5 ,8 ,-6, 0, 5 ,10 ,11 ,-3};
        int x =  sc.nextInt();
       System.out.println( getTripletSum(arr , x));
    }
}
