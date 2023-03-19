/*
 * Largest Row or Column
Send Feedback
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a separate line.
 Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
 */

public class LargestRowOrColumn {
    public static int findLargestRowOrColumn(int arr [][]){
        /*base case */
        if(arr.length ==0){
             return Integer.MIN_VALUE;
        }
        else{
        int largestRow = 0 ;
        int largestColumn =0;
        for(int i = 0 ; i <arr[0].length ; i++){
             int sum = 0;
            for(int j = 0 ; j< arr.length ; j++){
                sum  += arr[i][j];
                if(sum>largestRow){
                    largestRow = sum;
                }
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            int sum = 0;
            for(int j = 0 ; j<arr[0].length ;j++){
                sum += arr[j][i];
                if(largestColumn<sum){
                    largestColumn =sum;
                }
            }
        }

        if(largestColumn>largestRow){
            return largestColumn;
        }
    
    
      return largestRow;
    }
    }
    

    public static void main(String[] args) {
        int arr[][] = {{1,2,7,5},{1,4,2,5},{5,6,1,4},{7,4,1,8}};
       System.out.println(findLargestRowOrColumn(arr));
    }
}
