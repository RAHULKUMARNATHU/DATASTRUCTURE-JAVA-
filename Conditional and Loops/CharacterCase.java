
/*Find Character Case
Send Feedback
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet 

Sample Input 1 :
v
Sample Output 1 :
0
Sample Input 2 :
V
Sample Output 2 :
1
*/





import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        int i = ch;
      if(i>=65 && i<90 ){
            System.out.println(1);
        }else if(i>=97&& i<122){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
