/*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *

        int n=4
 */

public class ButterFly {
    public static void main(String[] args) {
        int row = 4;
        int x = 2 * row;
        // for upper triangle

        for (int i = 1; i <= row; i++) {
            int y = 2 * i;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // for spacing
            for (int j2 = 0; j2 < x - y; j2++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i = row; i >= 1; i--) {
            int y = 2 * i;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // for spacing
            for (int j2 = 0; j2 < x - y; j2++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
