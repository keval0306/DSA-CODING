package ArrayMed;

import java.util.Arrays;

// Longest Consecutive SubSequence

public class LCS {
    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };

        // BRUTE FORCE
        // int longest = 1;
        // for (int i = 0; i < arr.length; i++) {
        // int num = arr[i];
        // int count = 1;

        // while (ls(arr, arr[i]) == true) {
        // num++;
        // count++;
        // }

        // if (count > longest)
        // longest = count;
        // }
        // System.out.println(longest);

        // BETTER APPROACH
        // SORT ARRAY
        // LONGEST=1
        // CURRENT COUNT =0;
        // LAST ELEMENT=INTEGER_MIN_VALUE
        Arrays.sort(arr);
        int curr_count = 0;
        int longest = 1;
        int last_element = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == last_element) {
                curr_count++;
                last_element = arr[i];
            } else if (arr[i] != last_element) {
                curr_count = 1;
                last_element = arr[i];
            }

            if (curr_count > longest) {
                longest = curr_count;
            }
        }
        System.out.println(longest);

        // OPTIMAL APPROACH

    }

    public static boolean ls(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
