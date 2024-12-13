package ArrayBasic;

import java.util.HashMap;
import java.util.Map;

public class NumOccur {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 2, 2, 0 };

        int val = 4;
        // int hash[] = new int[10];

        // for (int i : arr) {
        // hash[i] += 1;
        // }

        // for (int i : hash) {
        // System.out.print(i + " ");
        // }

        // System.out.println(hash[val]);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int recent = 1;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > recent) {
                recent = m.getValue();
            }
            System.out.println("Key : " + m.getKey() + " Value : " + m.getValue());
        }

        System.out.println(recent);
    }
}
