public class immediate_smaller_ele {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 3 };
        int temp[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp[idx++] = arr[i + 1];
            } else if (arr[i] < arr[i + 1]) {
                temp[idx++] = -1;
            }
        }
        temp[arr.length - 1] = -1;

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
