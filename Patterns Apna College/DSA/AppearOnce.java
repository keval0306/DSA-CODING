package DSA;

public class AppearOnce {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4 };

        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i];
        }

        System.out.println(x);
    }
}
