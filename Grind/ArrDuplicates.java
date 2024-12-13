/*
 Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.


Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrDuplicates {
    public static void main(String[] args) {
        int arr[] = { 11, 12, 70, 37, 30, 63, 49, 12, 32, 63, 12, 51, 64, 45, 8, 67, 34, 1, 17, 67, 55, 23, 11, 42, 65,
                73, 41, 67, 67, 53, 29, 28, 49, 36, 38, 34, 21, 55, 14, 55, 33, 33, 23, 48, 14, 14, 1, 41, 4, 10, 37,
                16, 61, 73, 18, 24, 73, 51, 57, 23, 32, 66, 7, 63, 61, 24, 18, 9, 67, 53, 47, 17, 72, 69 };
        // Set<Integer> set = new HashSet<>();
        // for (int i : arr) {
        // if (set.contains(i)) {
        // int count = -1;
        // System.out.print(i + " ");
        // } else {
        // set.add(i);
        // }
        // }

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (set.contains(i)) {
                if (list.contains(i)) {
                    continue;
                } else {
                    list.add(i);
                }
            } else {
                set.add(i);
            }
        }
        if (list.isEmpty())
            list.add(-1);

        Collections.sort(list);
        System.out.print(list + " ");

    }
}
