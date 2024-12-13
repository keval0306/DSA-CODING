/*
            *
            **
            * *
            *  *
            *   *
            ******
 */

public class HollowTriangle {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == row - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
