package ConditionalOperators;

import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       if(a>0){
           if(a%2==0) {
               System.out.println("It's Even Number");
           }
           else {
               System.out.println("It's Odd Number");
           }
       }
       else{
           System.out.println("Not a positive Number");
       }
    }
}
