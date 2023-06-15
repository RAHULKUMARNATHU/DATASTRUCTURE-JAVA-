import java.util.Scanner;

public class MinimumLengthWord {
    public static String minimumLengthWord(String str){
        
        int minLengthWord = Integer.MAX_VALUE; 
        String ans = "";
        int j =0 ;
        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i) == ' '){
                int temp = str.substring(j, i-1).length();
                if(temp<minLengthWord){
                    minLengthWord = temp;
                    ans = str.substring(j, i);
                }
                j=i+1;
            } else if(i==str.length()-1){
                int temp = str.substring(j, i+1).length();
                 if(temp<minLengthWord){
                    minLengthWord = temp;
                    ans = str.substring(j, i+1);

                }
            }
        }
        return ans ;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aqwdqwd abwqdqwd bkjfkljrlfjlekrf cewfwef dewfwefw ewdwqd fqsqs gefewf hwefwef iewf jewf kewfwef lwded2e ba";
      System.out.println(minimumLengthWord(str));        

    }
}
