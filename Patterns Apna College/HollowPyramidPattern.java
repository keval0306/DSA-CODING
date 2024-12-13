/*
    *
   * *  
  *   *
 *     *
*********
 */

public class HollowPyramidPattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 0; i < row; i++) {
            // space
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
