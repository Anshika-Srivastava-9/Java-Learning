package Methods;
import java.util.Scanner;
public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(d,c)));
    }
}
