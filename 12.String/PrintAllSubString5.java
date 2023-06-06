import java.util.Scanner;

public class PrintAllSubString5 {
    public static void printAllSubString(String str){

        for(int start = 0 ; start <= str.length() ; start++){
            for(int end  = start ; end <= str.length() ; end ++){
                System.out.println(str.substring(start, end));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printAllSubString(str);
         sc.close();
    }
}
