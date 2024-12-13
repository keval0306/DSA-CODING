package ArrayBasic;
/*
Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.
 */

public class MissingNum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = 5;
        int sum = n * (n + 1) / 2;

        for (int i : arr) {
            sum = sum - i;
        }

        System.out.println("Missing Number Is :" + sum);
    }
}