/*Print Spiral
Send Feedback
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.


Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10  */


public class PrintSpiral {
    public static void printSpiral(int arr[][]){
        int n =arr.length;
        int m = arr[0].length;

        int RowStart=0;
        int ColStart= 0;
        int RowEnd = n-1;
        int ColEnd =m-1;
        int check = 0;
        while(check<n*m){
            /*upper boundary */

            for(int i = ColStart ;i<=ColEnd ;i++){
                System.out.print(arr[RowStart][i]+" ");
                check+=1;

            }

            RowStart +=1;
            /*right boundaries */
            for(int i = RowStart ;i<=RowEnd ;i++){
                System.out.print(arr[i][ColEnd]+" ");
            check+=1;
            }
            ColEnd-=1;

            /*bottom boundaries */
            for(int i = ColEnd ; i>=ColStart ;i--){
                System.out.print(arr[RowEnd][i]+" ");
            check+=1;
            }
            RowEnd-=1;

            /*Left Boundaries */
            for(int i =RowEnd ;i>=RowStart ;i--){
                System.out.print(arr[i][ColStart]+" ");
                check+=1;
            }
            ColStart+=1;
        }
    }
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,4},{14 , 15 , 16 ,5},{13,20 , 17 ,6},{12,19,18,7},{11,10,9,8}};
        printSpiral(arr);
    }
}
