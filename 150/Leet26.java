// Remove Duplicates from Sorted Array
/*
 Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

import java.util.HashSet;
import java.util.Set;

public class Leet26 {
    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        System.out.println(set);

    }
}
