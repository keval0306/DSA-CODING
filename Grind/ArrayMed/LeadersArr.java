package ArrayMed;

import java.util.ArrayList;

/*
 arr = {10,22,12,3,0,6}
 */

public class LeadersArr {
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        // BRUTE FORCE APPROACH
        // T.C. : O(N^2)

        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        // int leader = arr[i];
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > leader)
        // break;
        // else if (j == arr.length - 1 && arr[j] < leader) {
        // list.add(leader);
        // break;
        // } else
        // continue;
        // }

        // }
        // list.add(arr[arr.length - 1]);
        // System.out.println(list);

        // OPTIMAL APPROACH
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.println(arr[i]);
                max = arr[i];
            }
        }
    }
}
