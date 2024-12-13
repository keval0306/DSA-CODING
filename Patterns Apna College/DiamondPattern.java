/*
                *
              * * *
            * * * * *  
          * * * * * * *
          * * * * * * *
            * * * * * 
              * * * 
                *

                int n=4;

 */

public class DiamondPattern {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 0; i < row; i++) {
            // space
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = row; i >= 0; i--) {
            // space
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
