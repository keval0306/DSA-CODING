package ArrayMed;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        // better approach

        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // for (int i : arr) {
        // if (i == 0) {
        // count0++;
        // } else if (i == 1) {
        // count1++;
        // } else {
        // count2++;
        // }
        // }
        // System.out.println(count0 + " " + count1 + " " + count2);

        // for (int i = 0; i < count0; i++) {
        // arr[i] = 0;
        // }

        // for (int i = count0; i < count0 + count1; i++) {
        // arr[i] = 1;
        // }

        // for (int i = count0 + count1; i < arr.length; i++) {
        // arr[i] = 2;
        // }

        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        // optimal dutch national flag problem
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, arr[low], arr[mid]);
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                swap(arr, arr[mid], arr[high]);
                high--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
