import java.util.ArrayList;

class RemoveDuplicates {

    public static ArrayList<Integer> removeConsecutiveDuplicates(int arr[]) {

        ArrayList<Integer> result = new ArrayList<Integer>(20);

        result.add( arr[0]);
        for(int i  = 1 ; i< arr.length  ; i++){
            if(arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10 , 10 , 20 , 30 , 50};
        ArrayList<Integer> res =  removeConsecutiveDuplicates(arr);
        
        for( int i : res){
            System.out.println(i);
        }
    }
}