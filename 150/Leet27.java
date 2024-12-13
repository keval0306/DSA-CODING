// Remove Element

/* Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

import java.util.Arrays;

public class Leet27 {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 3;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println(count);
    }
}
