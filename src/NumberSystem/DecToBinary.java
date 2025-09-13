package NumberSystem;
import java.util.Scanner;
public class DecToBinary {
    public static void main(String []arg){
      Scanner sc=new Scanner (System.in);
      int decNum=sc.nextInt();
      int ans=0;
      int power=1;
      while(decNum>0){
          int parity= decNum % 2 ;
          ans += ( parity*power);
          power *= 10;
          decNum /= 2;
      }
        System.out.println(ans);
    }
}
