package Maths;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int x=n;
        int num=0;
        while(n>0){
            int ld=n%10;
            num=num+(ld*ld*ld);
            n/=10;
        }
        System.out.println(num);
        if(num==x)
            System.out.println("Armstrong Number ");
        else
            System.out.println("Not Armstrong number ");
    }
}
