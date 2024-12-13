public class min_value {
    public static void main(String[] args) {
        int arr[] = { 100, 22, 35, 14, 75, 16 };

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
