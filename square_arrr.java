public class square_arrr {
    public static void main(String[] args) {
        int arr[] = { 25, -11, 35, 10, -8, 4 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
