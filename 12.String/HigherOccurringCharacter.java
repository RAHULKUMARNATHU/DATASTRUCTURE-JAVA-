/*Highest Occuring Character
Send Feedback
For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
Consider:
Assume all the characters in the given string to be in lowercase always.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x */

import java.util.Scanner;

public class HigherOccurringCharacter {

    public static void higherOccurringCharacter(String str){
        int freq [] = new int[255];

        for(int i = 0 ; i< str.length() ; i++){
            freq[str.charAt(i)] += 1;
        }

        char ans = str.charAt(0);
        int max = freq[ans];        
       
        for(int i = 0 ; i<str.length();i++){
            if(freq[str.charAt(i)]>max){
                ans = str.charAt(i);
                max = freq[str.charAt(i)];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        higherOccurringCharacter(str);
    }
}
