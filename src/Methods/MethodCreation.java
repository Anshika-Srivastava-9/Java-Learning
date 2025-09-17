package Methods;

public class MethodCreation {
    public static void fun() {
        System.out.println("Hi, Good Morning");
        fun2();
        fun4();

    }

    public static void main(String[] args) {
        System.out.println("yo yo");
        fun();
        System.out.println("Gian");
        fun4();


    }
    public static void fun4() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void fun2() {
        System.out.println("Anshika");
    }

    public static void fun3() {
        System.out.println("How are you");
    }
}