package ArrayMed.Striver;

import java.util.HashMap;
import java.util.Map;

/*
 I/P = [1,2,3,-3,1,1,1,4,2,-3] k=3
 O/P = 
 */

public class CountSubArrSumK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;

        // BRUTE APPROACH
        // FIND ALL SUBARRAYS
        // T.C = O(N^3)
        int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // // System.out.print(arr[j] + " ");
        // int sum = 0;
        // for (int x = i; x <= j; x++) {
        // sum = sum + arr[x];
        // }
        // if (sum == k) {
        // count++;
        // }
        // }
        // }

        // BETTER APPROACH
        // FIND ALL SUBARRAYS
        // T.C = O(N^2)

        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // // System.out.print(arr[j] + " ");

        // sum = sum + arr[j];
        // if (sum == k) {
        // count++;
        // }
        // }

        // }

        // System.out.println(count);

        // OPTIMAL APPROACH
        // PREFIX SUM
        // Map<Integer, Integer> map = new HashMap<>();

        // int count = 0;
        // int presum = 0;

        // // initial muki j devanu kem k agar x-k=0 aave to map ma counter ni value 1
        // hoi
        // // etle increase krta fave

        // // 1, 2, 3, -3, 1, 1, 1, 4, 2, -3
        // map.put(0, 1);

        // for (int i = 0; i < arr.length; i++) {
        // presum += arr[i];
        // if (map.containsKey(presum)) {
        // map.put(presum, map.get(presum) + 1);
        // } else {
        // map.put(presum, 1);
        // }

        // if (map.containsKey(presum - k)) {
        // count = count + map.get(presum - k);
        // }

        // // if (presum - k == k) {
        // // count++;
        // // }
        // }
        System.out.println(count);
    }

}
