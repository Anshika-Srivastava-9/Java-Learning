package NumberSystem;
import java .util.Scanner ;
public class binaryToDec{
    public  static void main(String []args){
        Scanner sc=new Scanner(System.in) ;
        int binary_num=sc.nextInt();
        int result=0; // converted decimal number
        int power=1; //2^0=1 power of  2
        while(binary_num>0) {
            int unitDigit = binary_num % 10;   // give unit digit
            result += (unitDigit * power);
            power *= 2;                        // increase the power of 2
            binary_num/=10;                     // remove the unit digit
        }
        System.out.println(result);
    }

}
