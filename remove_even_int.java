public class remove_even_int {
    public static void main(String[] args) {
        int arr[] = { 101, 22, 35, 14, 75, 16 };

        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int temp[] = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
