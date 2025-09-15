package BasicsOfJava_Loop;

import java.util.Scanner;

public class AP_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term");
        int a=sc.nextInt();
        System.out.println("Enter common difference:");
        int cd=sc.nextInt();
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int lastNum=a+(n-1)*cd;
//        for (int i = 1; i <= 2 * n - 1; i += 2) {
//            System.out.println(i);
//        }

        for(int i=a;i<=lastNum;i+=cd){
            System.out.println(i+"");

        }
    }
}
