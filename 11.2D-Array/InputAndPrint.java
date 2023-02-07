import java.util.Scanner;
public class InputAndPrint{

    public static void printArray(int Array[][]){
        for(int i=0 ; i<Array.length ; i++){
            for(int j =0 ; j<Array[i].length;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row :");
        int n = sc.nextInt();
        System.out.print("Column :");
        int m = sc.nextInt();
        int Array[][] = new int [n][m];
        for( int i = 0 ; i<n ; i++){
            for(int j =0 ;j <m ; j++){
                Array[i][j] = sc.nextInt();
            }
        }
        printArray(Array);

    }
}