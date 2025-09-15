package Maths;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cout = 0;
        while (n > 0) {
            cout += 1;
            n /= 10;

        }
        System.out.println(cout);
    }
}