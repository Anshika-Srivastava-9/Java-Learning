package BasicsOfJava.Loops;

import java.util.Scanner;

public class AP_loop {
    public static void main(String []args) {
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of terms:");
       // int n = sc.nextInt();
        //for (int i = 1; i<=2*n-1; i += 2) {
         //   System.out.println(i);
       // }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of terms:");
//        int n = sc.nextInt();
//        int a=4,d=3;
//        for (int i =1; i<=n; i++){
//            System.out.println(a+" ");
////            a += d;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        System.out.println("Enter the first term:");
        int a=sc.nextInt();
        System.out.println("Enter the common difference of term:");
        int r=sc.nextInt();
        for (int i =1; i<=n; i++){
            System.out.println(a+" ");
           a *= r;
    }
    }
}
