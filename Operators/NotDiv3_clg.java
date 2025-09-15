package Operators;

import java.util.Scanner;

public class NotDiv3_clg {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n%3!=0)
            System.out.println("Not divisible by 3");
        else
            System.out.println("Divisible by 3");
    }
}
