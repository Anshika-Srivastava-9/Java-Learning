package BasicsOfJava.Loops;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if(n==1) {
            System.out.println("Neither prime nor composite");
        }
        else if (flag = true) {
            System.out.println("Composite number");
        } else {
            System.out.println("Primr number");
        }
    }
}
