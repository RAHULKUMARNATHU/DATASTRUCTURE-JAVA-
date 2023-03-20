/*
 * Total Sum on the Boundaries and Diagonals
Send Feedback
For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
 */

public class BoundariesAndDiagonalSum {

    public static int totalSum(int arr[][]){
        int total = 0 ;
        int n =arr.length;
        /*loop for upper boundary */
        for(int i = 0 ; i<arr.length;i++){
            total += arr[0][i];
            
        }
        
        /*Loop for bottom boundary */
        for(int i = 0 ; i <arr.length ; i++){
            total += arr[n-1][i];
        }
        
        /*Loop for left Boundary */
        for(int i = 1 ; i<arr.length-1 ; i++){
            total += arr[i][0];
        }

        /*Loop for Right Boundary */
        for(int i = 1 ; i<arr.length-1; i++){
            total +=arr[i][n-1];
        }

        /*Loop for Diagonals */
        for(int i = 1; i< arr.length-1 ; i++){
            for(int j =0 ; j<arr[0].length-1;j++){
                if(i==j){
                  
                    total += arr[i][j];
                }
                else if( i + j == n-1){
                    total += arr[i][j];
                  
                }
            }
        }
        

        return total;
    }
    public static void main(String[] args) {
          int arr[][] = {{6 ,9, 8, 5 },{9, 2 ,4, 1 },{8, 3, 9 ,3 },{8, 7 ,8 ,6}};
        int ans =totalSum(arr);
        System.out.println(ans);
    }
}





