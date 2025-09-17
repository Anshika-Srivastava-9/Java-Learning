package Methods;

import java.util.Scanner;

public class Combination {
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
        int rfact=fact(r);
        int n_rfact=fact(n-r);
        int nCr= fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
    }
}

//        int fact=1;
//    if(n==0||r==0){
//    System.out.println(fact);
//    }
//    for(int i=1;i<=n;i++){
//       nfact=(nfact*i);
//    }
//        int rfact=1;
//    for(int i=1;i<=r;i++){
//       rfact=(rfact*i);
//    }
//        int n_rfact=1;
//        for(int i=1;i<=n-r;i++){
//            n_rfact = (n_rfact*i);
//        }


