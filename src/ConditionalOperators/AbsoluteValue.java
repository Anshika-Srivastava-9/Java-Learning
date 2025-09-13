package ConditionalOperators;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n < 0) {
            n*=(-1);
        }
        System.out.println("The absolute value of the number is "+n);

        }
    }

