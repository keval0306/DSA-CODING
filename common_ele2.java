import java.util.*;

public class common_ele2 {
    public static void main(String[] args) {
        int arr1[] = { 89, 24, 75, 11, 23 };
        int arr2[] = { 89, 2, 4 };

        Set<Integer> hs = new HashSet<>();
        for (int a1 : arr1) {
            hs.add(a1);
        }

        for (int a2 : arr2) {
            if (hs.contains(a2)) {
                System.out.println(a2);
            } else {
                hs.add(a2);
            }
        }
    }
}