package BasicsOfJava_Loop;

import java.util.Scanner;

public class FactOfFirst5Num {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter yor number  ");
        int n= sc.nextInt();
        int fact=1;
        if(n==0){
            System.out.println(fact);
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println("Factorial of " +i+ " is " +fact);
        }
    }
}
