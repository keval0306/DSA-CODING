package LEET;

public class leet88 {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;

        if (m == 0)
            System.out.println(nums2);
        if (n == 0)
            System.out.println(nums1);

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        for (int i : nums1) {
            System.out.print(nums1[i] + " ");
        }
    }
}
