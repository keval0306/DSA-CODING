package DSA;

public class MaxConsec1s {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 1, 1, 1 };

        int counter = 0;
        int maximum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
                if (counter > maximum) {
                    maximum = counter;
                }

            } else if (arr[i] == 0) {
                counter = 0;
            }
        }

        System.out.println(maximum);
    }
}
