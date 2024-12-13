package DSA;

public class RotateArr {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int leftRotate = 2;

        reverse(arr, 0, leftRotate - 1);
        reverse(arr, leftRotate, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // function of reverse array
    public static void reverse(int arr[], int i, int j) {

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
