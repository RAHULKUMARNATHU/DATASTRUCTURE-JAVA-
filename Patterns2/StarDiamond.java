import java.util.Scanner;
public class StarDiamond{


  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int n1 = (n+1)/2;
        int n2 = n/2;
    //    First Half
        int i =1;
        while(i <= n1){
            int spaces= 1;
            while(spaces<=(n1-i)){
                System.out.print(" ");
                spaces+=1;
            }

            int star = 1;
            while(star<=(2*i)-1){
                System.out.print("*");
                star+=1;
            }
            System.out.println();
            i+=1;
        }
        
        // Second Half
        i =n2;
        while(i>=1){
            int spaces  =1 ;
            while(spaces<=(n2-i+1))
            {
                System.out.print(" ");
                spaces+=1;
            }
            int star = 1;
            while(star<=(2*i)-1){
                System.out.print("*");
                star+=1;
            }
            i-=1;
            System.out.println();
        }
       
    
}
}



