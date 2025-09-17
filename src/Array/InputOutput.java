package Array;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//                System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);

        int[] n = new int[7];

//        System.out.println(n.length);          (Length of array)
//        for (int i = 0; i < 7; i++) {
//        System.out.println(n[i] + " ");

        for (int i = 0; i < 7; i++) {                  //(INPUT)
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {                  //(OUTPUT PRINT)
            System.out.print(2*n[i]+" ");
        }

    }
}
