/*
        * * * * *
       * * * * *
      * * * * *
     * * * * * 
         */
public class SolidRhombus {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            // space
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}