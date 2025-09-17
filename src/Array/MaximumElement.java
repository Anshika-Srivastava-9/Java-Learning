package Array;

public class MaximumElement {
    public static void main(String[] args) {
        int arr[]={2,45,67,8,49,54,83,4};
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]>max)
               max=arr[i];
        }
        System.out.println(max);
    }
}
