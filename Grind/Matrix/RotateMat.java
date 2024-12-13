package Matrix;

public class RotateMat {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat[0].length; j++) {
        // System.out.print(mat[i][j] + " ");
        // }
        // System.out.println();
        // }

        // BRUTE APPROACH

        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat[0].length; j++) {
        // mat[j][mat.length - 1 - i] = mat[i][j];
        // }
        // }

        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < mat[0].length; j++) {
        // System.out.print(mat[i][j] + " ");
        // }
        // System.out.println();

        // OPTIMAL
        // TRANSPOSE AND THEN REVERSE ROW ONE BY ONE

        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                if (i == j) {
                    continue;
                } else {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[0].length - 1 - j];
                mat[i][mat[0].length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

}
