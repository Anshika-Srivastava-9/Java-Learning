package BasicsOfJava.Loops;

import java.util.Scanner;

public class SumOfNumberAndItsReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int number=n;
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n/=10;
        }
        System.out.println("Reverse of number is "+ rev);
        System.out.println("Sum of number and its reverse is:" +(number+rev));
    }

}
