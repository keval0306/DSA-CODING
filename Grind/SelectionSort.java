public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };

        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
