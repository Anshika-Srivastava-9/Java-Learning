package ConditionalOperators;
import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in) ;
        System.out.println("Enter the lenght and breadth of rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int Area=l*b;
        int primeter = 2*(l+b);
        if(Area >primeter){
            System.out.println("Area of rectangle is greater");
        }
        if(primeter>Area){
            System.out.println("perimeter is greater ");
        }
        else {
            System.out.println("Area and perimeter are equal");
        }
    }
}
