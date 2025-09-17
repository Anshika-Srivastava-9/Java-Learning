package Methods;

import java.util.Scanner;

public class Permutation {
    public  static int fact(int x) {
        int xfact = 1;
        for (int i= 1; i <= x; i++) {
            xfact = (xfact * i);
        }
        return xfact;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int n_rfact=fact(n-r);
        int nPr= fact(n)/(fact(n-r));
        System.out.println(nPr);
    }
}

