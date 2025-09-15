package Array;

public class MinimumElement {
    public static void main(String[] args) {
        int arr[] = {2, 45, 67, 8, 49, 54, 83, 4};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
}