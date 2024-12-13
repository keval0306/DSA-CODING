package ArrayHardStriver;

// Count the Number of Fair Pairs

/*
 Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
Output: 6
Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
 */
public class Leet2563 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 7, 4, 4, 5 };
        int lower = 3;
        int upper = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] >= lower && arr[i] + arr[j] <= upper) {
                    System.out.print(i + " " + j);
                    System.out.println();
                }
            }
        }
    }
}
