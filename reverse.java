import java.util.*;

public class reverse {
    public static void main(String[] args) {

        Integer arr[] = { 100, 22, 35, 14, 75, 16 };
        reverse(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void reverse(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
}
