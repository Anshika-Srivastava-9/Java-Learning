package Methods;

public class PassValueAndReference {
    public static void chnge(int x) {
         x = 10;
    }
    public static void main(String[] args) {
     int x=6;
        System.out.println(x);
      chnge(10);
        System.out.println(x);
    }
}
