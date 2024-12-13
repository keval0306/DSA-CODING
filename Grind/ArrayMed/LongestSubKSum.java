package ArrayMed;

/*
 
 */

public class LongestSubKSum {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 22, 8, 10, 3 };

        int target = 21;
        int maxx_len = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k < j; k++) {
                    sum = sum + arr[k];
                    if (sum == target) {
                        if (j - i + 1 > maxx_len) {
                            maxx_len = j - i + 1;
                        }
                    }
                }
            }
        }

        System.out.println(maxx_len);

    }
}
