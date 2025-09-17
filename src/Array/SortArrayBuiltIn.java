package Array;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // Sort- Ascending Order

        int[] arr={2,3,4,3,-3,-2,6};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
