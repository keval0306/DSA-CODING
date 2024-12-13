import java.util.*;

public class common_ele {
    public static void main(String[] args) {
        int arr1[] = { 89, 24, 75, 11, 23 };
        int arr2[] = { 89, 2, 4 };
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int x = 0;
        int y = 0;
        Set<Integer> hs = new HashSet<>();
        while (x < arr1.length && y < arr2.length) {
            if (arr1[x] == arr2[y]) {
                hs.add(arr1[x]);
                x++;
                y++;
            } else if (arr1[x] < arr2[y]) {
                x++;
            } else {
                y++;
            }
        }
        System.out.print(hs + " ");
    }
}
