public class insertion {
    public static void main(String[] args) {
        int arr[] = { 100, 22, 35, 14, 75, 16 };

        int key;
        int j;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i;

            while (j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
