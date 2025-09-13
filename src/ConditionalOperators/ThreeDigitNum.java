package ConditionalOperators;
import java .util.Scanner;
public class ThreeDigitNum {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       if(n>99&&n<1000){
           System.out.println("Three digit number");
       }
       else{
           System.out.println("Not three deigit number");
       }
    }
}
