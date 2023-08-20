import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(20);
        arr.add( 10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 80);
        arr.set(0, 100);

        // System.out.println(arr.size());
        // System.out.println(arr.get(1));
   
        // for(int i  = 0 ; i<arr.size() ; i++){
        //     System.out.println(arr.get(i));
        // }


        // Enhanced for Loop
        for(int i : arr){
            System.out.println(i);
        }

    }
}
