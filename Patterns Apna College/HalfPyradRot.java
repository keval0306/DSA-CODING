
/*
           *
         * * 
       * * *
     * * * *
     
         */

public class HalfPyradRot {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 0; i < row; i++) {
            // inner loop for space...
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
