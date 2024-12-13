package ArrayEasy;

/*
    I/P = [3,1,-2,-5,2,-4]

    O/P = [3,-2,1,-5,2,-4]
 */
public class RearrangeArrEle {
    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[posIndex] = arr[i];
                posIndex = posIndex + 2;
            } else
                arr[negIndex] = arr[i];
            negIndex = negIndex + 2;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
