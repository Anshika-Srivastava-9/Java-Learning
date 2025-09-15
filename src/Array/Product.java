package Array;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int product=1;
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,-9,-5,5,1,4};
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
        }
        System.out.println(product);
    }
}
