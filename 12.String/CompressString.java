import java.util.Scanner;

public class CompressString {

    public static String compressString(String str){
        
        int frequency [] = new int [256];
        String ans = "";

        for(int i =0 ; i<str.length() ; i++){
            frequency[str.charAt(i)] +=1;
        }

        for(int i = 0 ; i<str.length() ; i++){
            if(frequency[str.charAt(i)]>1){              
                ans += str.charAt(i);
                ans += (char)(frequency[str.charAt(i)] + '0' );
                frequency[str.charAt(i)] =0;
            }else if(frequency[str.charAt(i)]==1){
                ans += str.charAt(i);
                frequency[str.charAt(i)] = 0;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
       System.out.println(compressString(str));
       sc.close();
    }
}
