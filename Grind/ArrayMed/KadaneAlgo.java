package ArrayMed;

/*

MAXIMUM SUBARRAY SUM

 arr[] = {-2,-3,4,-1,-2,1,5,-3}

 output =7  (4,-1,-2,1,5)
 */
public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // BRUTE APPROACH
        // generate all sub arrays
        // T.C : O(N^3)

        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // int sum = 0;
        // for (int k = i; k < j; k++) {
        // sum += arr[k];
        // }
        // if (sum > max) {
        // max = sum;
        // }
        // }
        // }

        // System.out.println("Max subarray sum: " + max);

        // Better Approach
        // T.C. : O(N^2)

        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum += arr[j];
        // if (sum > max) {
        // max = sum;
        // }
        // }

        // }
        // System.out.println("Max subarray sum: " + max);

        // OPTIMAL APPROACH
        // KADANE ALGO

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }

            if (sum > max) {
                max = sum;
                start = start;
                end = i;
            }

        }
        System.out.println(max);
        // System.out.println(start);
        // System.out.println(end);
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
