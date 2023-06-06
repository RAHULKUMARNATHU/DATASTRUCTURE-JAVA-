import java.util.Scanner;

public class CheckPalindrome4 {
    public static Boolean checkPalindrome(String str){
        
        String revString = "";
        int length = str.length();
        if(length ==0){
            return false;
        }
        for(int i =0 ; i<length ; i++){
            revString = str.charAt(i)+revString;
        }
        if(revString.equals(str)){
            return true;
        }       
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
        sc.close();
    }
}
