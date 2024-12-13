package ArrayEasy;

/*
 Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
 */
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };

        int pointer1 = 0;// for zero
        // for non zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[pointer1] == 0) {
                int temp = arr[i];
                arr[i] = arr[pointer1];
                arr[pointer1] = temp;
            }
            if (!(arr[pointer1] == 0))
                pointer1++;
        }

        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
