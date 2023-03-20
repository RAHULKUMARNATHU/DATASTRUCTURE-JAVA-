/*Print Like a Wave
Send Feedback
For a given two-dimensional integer array/list of size (N x M),
 print the array/list in a sine wave order, i.e,
  print the first column top to bottom, next column bottom to top and so on. 
  Sample Input 1:

3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4
  */
public class PrintWave {
    public static void printWave(int arr[][]){
        for(int i =0 ; i<arr.length;i++){
            if(i%2!=0){
                for(int j =arr.length;j>0;j--){
                    System.out.print(arr[i][j-1]+" ");
                }
                System.out.println();
            }else{

                for(int j =0 ;j<arr.length ; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
          int arr[][] = {{6 ,9, 8, 5 },{9, 2 ,4, 1 },{8, 3, 9 ,3 },{8, 7 ,8 ,6}};
          printWave(arr);
    }
}
