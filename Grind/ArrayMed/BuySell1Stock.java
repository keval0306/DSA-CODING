package ArrayMed;

/*
 input ={7,1,5,3,6,4}

 */

public class BuySell1Stock {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 5, 3, 6, 8 };

        int profit = Integer.MIN_VALUE;
        // BRUTE FORCE APPROACH
        // T.C. : O(N^2)

        // for (int i = 0; i < arr.length; i++) {
        // int min = arr[i];
        // int temp_profit = 0;

        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > min) {
        // temp_profit = arr[j] - min;

        // }

        // if (temp_profit > profit) {
        // profit = temp_profit;
        // }
        // }

        // }

        // System.out.println(profit);

        // OPTIMAL APPROACH
        // T.C. : O(N)

        int maxProfit = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            if (cost > maxProfit)
                maxProfit = cost;
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(maxProfit);
    }
}
