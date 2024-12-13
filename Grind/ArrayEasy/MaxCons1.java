package ArrayEasy;

/*
 Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3
 */

public class MaxCons1 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        int maxCount = Integer.MIN_VALUE;
        int recentCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (recentCount > maxCount)
                maxCount = recentCount;
            if (arr[i] != 1)
                recentCount = 0;
            else
                recentCount++;

        }
        System.out.println(maxCount);
    }
}
