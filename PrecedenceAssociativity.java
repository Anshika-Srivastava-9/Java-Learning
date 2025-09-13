package Operators;

public class PrecedenceAssociativity {
    public static void main(String[] args) {
        System.out.println(4+2+"pqr");
        System.out.println("pqr"+4+2);
        boolean p=true;
        boolean q=false;
        boolean r=true;
        System.out.println(p==q==r);

    }
}
