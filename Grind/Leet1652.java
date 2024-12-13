/*
    Input: code = [5,7,1,4], k = 3
Output: [12,10,16,13]
Explanation: Each number is replaced by the sum of the next 3 numbers. 
The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
 */

public class Leet1652 {
    public static void main(String[] args) {
        // int arr[] = { 5, 7, 1, 4 };
        // int code[] = { 5, 7, 1, 4 };

        int arr[] = { 2, 4, 9, 3 };
        int code[] = { 2, 4, 9, 3 };
        int k = -2;

        if (k > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 0;
                int recent = 1;
                int j = i + 1;
                while (recent <= k) {
                    arr[i] = arr[i] + code[(j + code.length - 1 - k) % code.length];
                    recent++;
                    j++;
                    System.out.println(arr[i]);
                }

            }
        } else if (k < 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 0;
                int recent = 1;
                int j = i - 1;
                while (recent <= k) {
                    arr[i] = arr[i] + code[(j + code.length - 1 - k) % code.length];
                    recent++;
                    j--;
                    System.out.println(arr[i]);
                }

            }
            // } else {
            // for (int i = 0; i < code.length; i++) {
            // code[i] = 0;
            // }
            // }

            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}