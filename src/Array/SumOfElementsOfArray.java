package Array;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        System.out.println("Enter the length of Array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

         sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
