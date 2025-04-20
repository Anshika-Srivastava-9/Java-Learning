package BasicsOfJava.Loops;
import java .util.Scanner;
public class Reverse {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        //REVERSE OF NUMBER//
//        int rev=0;
//        int sum=0;
//        while(n!=0) {
//            int ld = n % 10;
//            rev *= 10;
//            rev += ld;
////            n /= 10;
////        }
////            System.out.println(rev);


        //SUM OF REVERSED NUMBER AND ORIGINAL NUMBER//

        int original = n;   //TO STORE THE VALUE OF N AND IF DO NOT STORE IT THEN N WILL BECOME ZERO BECOZ OF WHILE LOOP CONDITION VALUE OF N IS CHANGING AND WE GET THE SAME NUMBER AS OUTPUT//
        int rev = 0;

        while (n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }

        int sum = original + rev;

        System.out.println("Reverse: " + rev);
        System.out.println("Sum of original and reverse: " + sum);
    }
}
