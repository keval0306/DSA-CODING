import java.util.Arrays;

public class triplets {
    public static void main(String[] args) {
        int target = 12;
        int arr[] = { -6, 2, 8, 5, 7, 11, -1 };

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                if (arr[i] + arr[start] + arr[end] == target) {
                    System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
                    break;
                } else if (arr[i] + arr[start] + arr[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
    }
}
