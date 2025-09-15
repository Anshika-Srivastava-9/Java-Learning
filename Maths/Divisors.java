package Maths;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+"  ");
                if((n/i)!=1)
                    System.out.print(n/i+" ");
            }
        }
        System.out.println();
    }
}
