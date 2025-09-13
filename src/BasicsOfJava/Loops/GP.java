package BasicsOfJava.Loops;

import java.util.Scanner;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term");
        int a = sc.nextInt();
        System.out.println("Enter common ratio:");
        int cr = sc.nextInt();
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(a + "");
            a *= cr;
        }
    }
}