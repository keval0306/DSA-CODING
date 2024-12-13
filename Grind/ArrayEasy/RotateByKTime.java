package ArrayEasy;

/*
 Example 2:
Input: N = 6, array[] = {1,2,3,4,5,6,7} , k=2 , left 
Output: 3 4 5 6 7 1 2
Explanation: Array is rotated to left by 2 position.
 */
public class RotateByKTime {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        // int j = 0;
        // while (j < k) {
        // int k1 = arr[j];
        // System.out.println(k1);
        // arr[arr.length - j - 1] = k1;
        // j++;
        // }

        // // for (int i = 0; i < k; i++) {
        // // arr[i]
        // // }

        // for (int i = 0; i < arr.length - k; i++) {
        // arr[i] = arr[(i + k) % arr.length];
        // }

        // reverse logic
        // first reverse only upto k elements of array
        reverse(arr, 0, k - 1);

        // now reverse from k index to whole array
        reverse(arr, k, arr.length - 1);

        // reverse whole array
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
