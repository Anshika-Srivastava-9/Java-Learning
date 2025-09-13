package ConditionalOperators;
import java.util.Scanner;
public interface divBy5_NotBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 != 0) {
            System.out.println("Number divisible by 5 not by three");
        } else {
            System.out.println("Number divisible by both 3 and 5");
        }
    }
}