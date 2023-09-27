import java.util.ArrayList;

public class PrintMissingEle {

    public static ArrayList<Integer> checkMissingEle(int[] arr) {

        boolean[] visited = new boolean[11];

        // int arr1 [] = new int [5];
        for (int ele : arr) {
            visited[ele] = true;
        }

        ArrayList<Integer> missingEle = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            if (!visited[i]) {
                missingEle.add(i);
            }
        }

        return missingEle;
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        for (int val : arrayList) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };
        ArrayList<Integer> res = checkMissingEle(arr);
        printArrayList(res);

    }
}
