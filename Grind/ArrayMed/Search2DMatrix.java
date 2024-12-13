package ArrayMed;

import java.util.Scanner;

/*
 Input Format:
 N = 3, M = 4, target = 8,

mat[] = 
1 2 3 4
5 6 7 8 
9 10 11 12

Result:
 true

Explanation:
 The ‘target’  = 8 exists in the 'mat' at index (1, 3).
 */
public class Search2DMatrix {
    public static void main(String[] args) {
        int row = 3;
        int col = 4;

        int target = 8;
        int arr[][] = new int[row][col];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr.length; k++) {

                }
            }
        }
    }
}
