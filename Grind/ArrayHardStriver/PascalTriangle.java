package ArrayHardStriver;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int row = 6;

        // creating pascal triangle

        for (int i = 1; i <= row; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < i; j++) {
                list.add(ncr(i - 1, j - 1));
            }
            System.out.print(list + " ");
            list.clear();
        }

    }

    public static int ncr(int n, int r) {
        int ans = 1;

        for (int i = 1; i < r; i++) {
            ans = ans * (n - i);
            ans = ans / i;
        }
        return ans;
    }
}
