import java.util.Scanner;

public class CheckPalindrome4 {
    // public static Boolean checkPalindrome(String str){
        
    //     String revString = "";
    //     int length = str.length();
    //     if(length ==0){
    //         return false;
    //     }
    //     for(int i =0 ; i<length ; i++){
    //         revString = str.charAt(i)+revString;
    //     }
    //     if(revString.equals(str)){
    //         return true;
    //     }       
    //     return false;
    // }


    /*Optimized */
    public static boolean checkPalindrome(String str){

        int i = 0 ;
        int j = str.length()-1;

        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
             return false;  
            }
            i++;
            j--;
        }

        return true;
    }  
  
  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
        sc.close();
    }
}
