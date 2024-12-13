public class kadane {
    public static void main(String[] args) {
        int arr[] = { 8, -3, 4, -2 };
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int s = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }

        }

        System.out.println(max_so_far);

        for (int j = start; j < end + 1; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
