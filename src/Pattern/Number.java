package Pattern;
import java.util.Scanner;
public class Number {
    public static void main(String[]args){
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
                                                                   // output //
        for(int i=1;i<=n;i++){                                       //11111
            for(int j=1;j<=n;j++){                                   //22222
                System.out.print(i+" ");                             //33333
            }
            System.out.println();
        }

    }
}
