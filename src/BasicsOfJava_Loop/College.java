package BasicsOfJava_Loop;

import java.util.Scanner;

public class College {
    public static void main(String[] args) {
//        for (int i = 0; i <= 5; i++) {                              //FOR LOOP
//            System.out.print(i+" ");
//           }
//        System.out.println();
//        int n =0 ;
//            while (n<5) {                                        //WHILE LOOP
//                System.out.print(n+" ");
//                n+=1;


//        for (int i = 0; i <= 10; i++) {                              //FOR LOOP
//            System.out.print(i+" ");
//           }


        int sum = 0;
        int n=1;
        while (n <= 10) {
            sum += n;
            n++;
        }
        System.out.println(sum);
    }
}

