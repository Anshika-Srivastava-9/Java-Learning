package Operators;

import java.util.Scanner;

public class CustomerDiscount_clg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter purchase Amount:");
        int Amount=sc.nextInt();
        System.out.println("Do you have card:yes or no?");
        String card=sc.nextLine();
        if (Amount>1000){
            System.out.println("Ypou will get discount");
        }
        else
            System.out.println("You are not eligible for discount ");
    }
    }

