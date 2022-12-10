import java.util.Scanner;

/* Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
Input format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary 

Sample Input 1 :
10000 A
Sample Output 1 :
17600

*/


public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        String str  = sc.nextLine();
        char ch = str.charAt(0);
        double hra = basic*(0.2);
        double da  = basic*(0.5);
        double pf = basic*(.11);
        double totalSalary = 0 ;

        if(ch == 'A'){
            int allow = 1700;
            totalSalary =  (basic + hra + da + allow) - pf;
            System.out.println(Math.round(totalSalary) );
        }else if(ch == 'B'){
            int allow = 1500;
            totalSalary = (int)(basic + hra + da + allow) - pf;
            System.out.println(Math.round(totalSalary));
        }else{
             int allow = 1300;
            totalSalary = (int)(basic + hra + da + allow) - pf;
            System.out.println(Math.round(totalSalary));
        }







    }

}
