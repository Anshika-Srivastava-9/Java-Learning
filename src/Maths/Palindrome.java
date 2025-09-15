package Maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int x = n;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        System.out.println("Reverse of number " + rev);
        if (rev == x) {
            flag = true;
        }
        System.out.println("Is Palindrome?" + flag);
    }
}
