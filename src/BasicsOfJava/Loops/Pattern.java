package BasicsOfJava.Loops;

import java.util.Scanner;
public class Pattern {
    public static void main(String [] args){

        //SUM OF ALL DIGIT OF GIVEN NUMBER//
//    -------------------------------------------
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        while(n!=0){
//            int ld = n%10;  //This will give remainder
//            sum+=ld;
//            n/=10;          // This will remove last number
//  }
//           System.out.println(sum);


           //PRODUCT OF ALL DIGIT OF GIVEN NUMBER//
//      ----------------------------------------------
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int product=1;
//        while(n!=0){
//            int ld = n%10;  //This will give remainder
//            product*=ld;
//            n/=10;          // This will remove last number
//        }
//        System.out.println(product);


               //PRODUCT OF NON-ZERO NUMBERS//
//        -------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int product = 1;
//        while (n != 0) {
//            int ld = n % 10;      // last digit
//            if (ld == 0) {        // skip zero digits
//                n /= 10;          // remove that digit
//                continue;
//            }
//            product *= ld;        // multiply by non-zero digit
//            n /= 10;              // remove that digit
//        }
//
//        System.out.println(product);

        //SUM OF ALL EVEN DIGIT OF GIVEN NUMBER//
//  -------------------------------------------------
        Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
        int sum=0;
        while(n!=0){
            long ld=n%10;
            if(ld%2!=0) {
                n /= 10;
                continue;
            }
             sum+=ld;
            n/=10;
            }
        System.out.println(sum);
        }
    }
