import java.util.*;

public class longest_subseq {
    public static void main(String[] args) {
        int arr[] = { 2, 12, 1, 9, 4, 5, 3 };
        int long_long = 0;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        int no = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {
                no = arr[i];

                while (hs.contains(no)) {
                    no++;
                }
                if (long_long < no - arr[i]) {
                    long_long = no - arr[i];
                }
            }
        }

        System.out.println("Longest SubSequence is :" + long_long);

        for (int i = no; i < long_long; i++) {
            System.out.println(i);
        }
    }
}
