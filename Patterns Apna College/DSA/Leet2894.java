package DSA;

// divisible and non divisible sums difference
// two integers given n and m
// range : [1,n] => num1 : that are not divisible by m
// range : [1,n] => num2 : that are divisible by m

// input : n=10 , m=3
// output : 19
public class Leet2894 {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        int x = 0;
        int y = 0;
        int nums1[] = new int[n];
        int nums2[] = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                nums1[x++] = i;
            } else {
                nums2[y++] = i;
            }
        }

        int sum1 = 0;
        for (int i : nums2) {
            sum1 += i;
        }

        int sum2 = 0;
        for (int i : nums1) {
            sum2 += i;
        }

        System.out.println(sum1 - sum2);
    }
}
