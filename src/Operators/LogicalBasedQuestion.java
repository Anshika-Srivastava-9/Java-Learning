package Operators;

import java.util.Scanner;

public class LogicalBasedQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of maths and science:");
        int maths=sc.nextInt();
        int Science=sc.nextInt();
        if (maths>=40&& Science>=40){
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");
    }
}
