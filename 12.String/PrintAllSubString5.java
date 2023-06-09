/*Print subString for
pqrs
p
q
r
s
pq
qr
rs
pqr
qrs
pqrs
 */

import java.util.Scanner;

public class PrintAllSubString5 {
    public static void printAllSubString(String str){

        /*Print substring like in desc order  */
        // for(int start = 0 ; start <= str.length() ; start++){
        //     for(int end  = start ; end <= str.length() ; end ++){
        //         System.out.println(str.substring(start, end));
        //     }
        // }

        for(int i = 0 ; i<= str.length() ; i++){
            int start = 0 ;
            for(int end = i ; end < str.length() ; end ++){
                System.out.println(str.substring(start, end+1));
                start++;
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
