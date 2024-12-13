public class move_neg {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int temp[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[idx++] = arr[i];
            } else {
                continue;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[idx++] = arr[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
