import java.util.Scanner;

public class ReverseString3 {

    public static String reverseString(String str){
    int length = str.length();
    if(length == 0){
        return "";
    }
    String revString ="";

    // for(int i = length-1 ; i>= 0 ; i--){
    //     revString += str.charAt(i); 
    // }   

    for(int i = 0 ; i< length ; i++){
        revString = str.charAt(i)+revString;
    }

    return revString ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
    
}
