import java.util.Scanner;

public class RevString {
    public static String helperFun(String str){
        int start =0;
        int end = str.length();
       return  revString(str, start, end);
    }
    public static String revString(String str , int start ,int end ){
        String newString ="";
        if(start < end){
          newString = str.charAt(end) + newString;
        revString(str , start , end - 1 );
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(helperFun(str));

    }
}
