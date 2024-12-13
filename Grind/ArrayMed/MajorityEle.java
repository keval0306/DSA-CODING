package ArrayMed;

import java.util.HashMap;
import java.util.Map;

/*
 Find element that occurs more than n/2 times in giveen array...
 */

public class MajorityEle {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 3, 1, 3, 3, 3 };

        // BRUTE FORCE APPROACH TC : O(N^2)

        // for (int i = 0; i < arr.length; i++) {
        // int count = 0;
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[i] == arr[j])
        // count++;
        // }
        // if (count > arr.length / 2)
        // System.out.println(arr[i]);
        // }

        // BETTER APPROACH
        // USSING HASHING MAP APPROACH

        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i : arr) {
        // if (map.containsKey(i)) {
        // map.put(i, map.get(i) + 1);
        // } else {
        // map.put(i, 1);
        // }
        // }

        // for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
        // if (mp.getValue() > arr.length / 2) {
        // System.out.println("key : " + mp.getKey() + " value : " + mp.getValue());
        // }
        // }

        // OPTIMAL APPROACH MOORE'S VOTING ALGO. APPROACHH
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                count1++;
            }
        }
        if (count1 > arr.length / 2) {
            System.out.println(el);
        }
    }
}
