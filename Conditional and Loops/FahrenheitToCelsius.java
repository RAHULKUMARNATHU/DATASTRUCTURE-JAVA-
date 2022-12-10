/*Fahrenheit to Celsius Table
Send Feedback
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all
 Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :
3 integers - S, E and W respectively 
Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.

Sample Input 1:
0 
100 
20

Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37


*/

import java.util.Scanner;

public class FahrenheitToCelsius {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int S = sc.nextInt();
         int E = sc.nextInt();
         int W = sc.nextInt();
         
 

      while(S <= E){
            double c = (S-32)* (5.0/9) ;
			int f = (int) c;
    			System.out.println(S+"\t"+f);  
                S += W;
         
      }
    }
}
