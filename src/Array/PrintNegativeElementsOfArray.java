package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintNegativeElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements:  " );
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }

        }
    }
}
