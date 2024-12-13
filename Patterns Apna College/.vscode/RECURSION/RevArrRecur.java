public class RevArrRecur {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 9, 10 };
        int l = 0;
        int r = arr.length - 1;

        // revArr(l, r, arr);

        // by using ony one integer
        revArrOneInt(l, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void revArrOneInt(int l, int[] arr) {
        if (l >= (arr.length) / 2) {
            return;
        }
        swap(l, arr.length - l - 1, arr);
        revArrOneInt(l + 1, arr);
    }

    public static void revArr(int l, int r, int arr[]) {
        if (l >= r) {
            return;

        }

        swap(l, r, arr);

        revArr(l + 1, r - 1, arr);

    }

    public static void swap(int x, int y, int arr[]) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
