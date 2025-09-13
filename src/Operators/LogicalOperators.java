package Operators;
public class LogicalOperators {
    public static void main(String[] args) {
       int a=23;
       int b=34;
       int c=88;
       //AND operator
        System.out.println((a<b) && (b<c));
        System.out.println((a>b) && (b<c));

        //OR operator
        System.out.println((a>b) || (b<c));
        System.out.println((a<b) || (b<c));

        // NOT operator
        System.out.println(!(a<b));
        System.out.println(!(a>b));
    }
}
