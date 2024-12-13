import java.util.HashSet;
import java.util.Set;

public class union_ele {
    public static void main(String[] args) {
        int A[] = { 1, 5, 10, 20, 40, 80 };
        int B[] = { 6, 7, 20, 80, 100 };
        int C[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

        int x = 0;
        int y = 0;
        int z = 0;
        Set<Integer> hs = new HashSet<>();
        while (x < A.length && y < B.length && z < C.length) {
            if (A[x] == B[y] && B[y] == C[z]) {
                hs.add(A[x]);
                x++;
                y++;
                z++;
            } else if (A[x] < B[y]) {
                x++;
            } else if (B[y] < C[z]) {
                y++;
            } else {
                z++;
            }
        }

        System.out.println(hs);
    }
}
