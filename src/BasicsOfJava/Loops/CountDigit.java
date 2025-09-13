package BasicsOfJava.Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int count=0;
        if(n==0)
            count++;
        while(n>0){
         n= n/10 ;
            count+=1;
    }
        System.out.println(count);
    }
}
