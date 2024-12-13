package ArrayEasy;

import java.util.Arrays;

/*
    Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
    Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)

Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.
 */

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 0, 11 };
        int target = 8;

        // BRUTE

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // System.out.print(arr[i] + " " + arr[j]);
        // }
        // }
        // }

        // Better
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                System.out.println(arr[start] + " " + arr[end]);
                start++;
                end--;
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else {
                end--;
            }
        }
    }
}
