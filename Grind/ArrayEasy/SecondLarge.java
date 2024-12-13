package ArrayEasy;

import java.util.Collections;

public class SecondLarge {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 1, 20, 20, 10 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // largest element
        System.out.println("Largest Element : " + arr[arr.length - 1]);
        int largest = arr[arr.length - 1];
        // second largest
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                System.out.println("Second Largest : " + arr[i]);
                break;
            }
        }

        // another better approach
        int largest1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest1)
                largest1 = arr[i];
        }

        int SecondLarge = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > SecondLarge && arr[i] != largest1)
                SecondLarge = arr[i];
        }

        System.out.println("Second better large : " + SecondLarge);

        // optimal approach
        int large3 = arr[0];
        int secondLarge2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large3) {
                secondLarge2 = large3;
                large3 = arr[i];

            } else if (arr[i] < large3 && arr[i] > secondLarge2)
                secondLarge2 = arr[i];
        }

        System.out.println("Optimal Large : " + large3);
        System.out.println("Optimal Second Large : " + secondLarge2);

    }
}
