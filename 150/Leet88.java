// merge sorted array
/*
 Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

import java.util.Arrays;

public class Leet88 {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        int i = m;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
        for (int k : nums1) {
            System.out.print(k + " ");
        }

    }
}
