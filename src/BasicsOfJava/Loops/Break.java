package BasicsOfJava.Loops;
import java.util.Scanner;
public class Break   {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     //WITHOUT BREAK STATEMENT//
//     int n= sc.nextInt();
//     int hf=1;
//        for (int i=1; i<n; i++) {
//          if(n % i==0)
//            hf=i;
//
//          }
//        System.out.println(hf);

       //USING BREAK STATEMENT//
        int n= sc.nextInt();
        int hf=1;
        for(int i=n-1;i>=1;i--) {
            if (n % i == 0) {
                hf = i;
                System.out.println(hf);
                break;
            }
        }

    }
}
