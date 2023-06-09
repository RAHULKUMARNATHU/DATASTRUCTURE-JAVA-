
/*
Reverse String Wordwise
Send Feedback
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to dsa 
Sample Output 1:
dsa to Welcome
 */


import java.util.Scanner;

public class ReverseWordWise6 {
    
    public static String reverseWordWise(String str){


        /*With extra string array */
        int length = str.length()-1;
        String revString = "";
        int end =str.length();
        for( int start = length; start>=0 ; start --){
                if(str.charAt(start) == ' '){
                    revString += str.substring(start+1, end)+" ";
                   end = start;
                }
                else if(start ==0){
                revString += " "+str.substring(start , end);
                }
            

        }
        
        return revString;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWordWise(str));

    }
}
