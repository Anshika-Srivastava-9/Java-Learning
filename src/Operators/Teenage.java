package Operators;
import java.util.Scanner;
public class Teenage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        if (age >= 13 && age < +19) {
            System.out.println("Teenage");
        }
        else
            System.out.println("Not teenage ");
    }
}
