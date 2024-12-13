package ArrayEasy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDupsSortArr {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };

        // brute

        // Set<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        // set.add(i);
        // }

        // int idx = 0;
        // for (int i : set) {
        // arr[idx] = i;
        // idx++;
        // }

        // for (int integer : arr) {
        // System.out.print(integer + " ");
        // }

        // optimal
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[j]) {
                j++;
                System.out.println("incre");
            } else {
                System.out.println(" NOT incre");

                arr[i + 1] = arr[j];
                i++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
