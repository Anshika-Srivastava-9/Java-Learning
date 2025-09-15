package BasicsOfJava_Loop;

import java.util.Scanner;

public class PrintTble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i<=n*10;i+=n){
            System.out.println(i);


//            for(int i=19;i<=190;i+=19){
//                if(i%19==0){
//                    System.out.println(i);
//                }
        }
    }
}
