public class SecondLarge {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };

        int largest = arr[0];
        int seconLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                seconLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > seconLargest) {
                seconLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(seconLargest);
    }
}
