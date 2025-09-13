package BasicsOfJava.Loops;

import java.util.Scanner;

public class ProductOfNonZeroDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int product=1;
        while(n!=0){
            int ld= n%10;
            if(ld!=0) {
                product*=ld;
            }
            n/=10;
        }
        System.out.println(product);
    }
}
