package Matrix;

public class SpiralMat {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        /*
         * 1 2 3 4 5
         * 6 7 8 9 10
         * 11 12 13 14 15
         * 16 17 18 19 20
         * 
         */

        int minr = 0;
        int minc = 0;
        int maxr = mat.length - 1;
        int maxc = mat[0].length - 1;
        int te = mat.length * mat[0].length;
        int count = 0;

        while (count < te) {
            for (int i = minr, j = minc; j <= maxc; j++) {
                System.out.print(mat[i][j] + " ");
                count++;
            }

            minr++;

            for (int i = minr, j = maxc; i <= maxr && count < te; i++) {
                System.out.print(mat[i][j] + " ");
                count++;
            }
            maxc--;

            for (int i = maxr, j = maxc; j >= minc && count < te; j--) {
                System.out.print(mat[i][j] + " ");
                count++;
            }
            maxr--;

            for (int i = maxr, j = minc; i >= minr && count < te; i--) {
                System.out.print(mat[i][j] + " ");
                count++;
            }

            minc++;

        }
    }
}
