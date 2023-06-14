import java.util.Scanner;

public class PrintFrequency {
    /*printing frequency with character */
    public static void printFrequency(String str){
        int frequency [] = new int [256];
        for(int i = 0 ; i<str.length() ; i++){
            frequency[str.charAt(i)] += 1 ;
        }

        for(int i =0 ; i< str.length(); i++){
            System.out.println(str.charAt(i) +" "+ frequency[str.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printFrequency(str);
    }
    
}
