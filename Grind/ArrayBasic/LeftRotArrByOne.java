package ArrayBasic;

/*
 Input:
 N = 5, array[] = {1,2,3,4,5}


 
 Output:
 2,3,4,5,1
 */

public class LeftRotArrByOne {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // int temp[] = new int[arr.length];
        // for (int i = 0; i < arr.length - 1; i++) {
        // temp[i] = arr[i + 1];
        // }
        // temp[temp.length - 1] = arr[0];
        // for (int i : temp) {
        // System.out.print(i + " ");
        // }

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
