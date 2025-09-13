package ConditionalOperators;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int CP=sc.nextInt();
    int SP=sc.nextInt();
    int loss=CP-SP;
    int profit=SP-CP;
    if(CP==SP){
        System.out.println("Neither profit nor loss");
    }
    if(CP<SP){
        System.out.println("The seller has made loss of Rs"+profit);
    }
    else{
        System.out.println("The seller has made Profit of Rs"+loss);
    }
    }
}
