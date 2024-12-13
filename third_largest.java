public class third_largest {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5, 8, 6 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != thirdMax && arr[i] != max) {
                thirdMax = secondMax;
                secondMax = arr[i];

            } else if (arr[i] > thirdMax && arr[i] != secondMax && arr[i] != max) {
                thirdMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
    }
}
