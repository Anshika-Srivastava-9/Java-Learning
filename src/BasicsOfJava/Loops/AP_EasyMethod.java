package BasicsOfJava.Loops;

import java.util.Scanner;

public class AP_EasyMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term");
        int a=sc.nextInt();
        System.out.println("Enter common difference:");
        int d=sc.nextInt();
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a+"");
           a+=d;
        }
    }
}
