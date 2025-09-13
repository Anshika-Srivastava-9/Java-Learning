package Pattern;
import java.util.Scanner;
public class StarPlus {
    public static void main(String[] agr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int midrow=(m+1)/2;
        int midcol=(n+1)/2;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==midrow||j==midcol)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}

