package Matrix;

/* Set matrix 0 */

public class SetMat0 {
    static int mat[][] = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };

    public static void main(String[] args) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    markRow(i);
                    markCol(j);
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
            System.out.println();
        }

        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat[0].length; j++) {
        // System.out.print(mat[i][j] + " ");
        // }
        // System.out.println();
        // }

        // BETTER APPROACH
        // TWO DIFF ARR FOR COL AND ROWS
        int rows[] = new int[mat.length];
        int cols[] = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {

                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void markRow(int i) {
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j] != 0) {
                mat[i][j] = -1;
            }
        }
    }

    private static void markCol(int j) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][j] != 0) {
                mat[i][j] = -1;
            }
        }
    }

}
