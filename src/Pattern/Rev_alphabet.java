package Pattern;
import java.util.Scanner;
public class Rev_alphabet {
    public static void main(String[] agr){
       Scanner alpha= new Scanner (System.in);
       int n=alpha.nextInt();
       for(int i=1;i<=n;i++){
           for (int j = 1; j<= n+1-i ; j++) {
               if(i%2==0) {
                   System.out.print(i+" ");
               }
               else {
                   System.out.print((char)(i + 64)+" ");
               }
           }
           System.out.println();
       }
    }
}
