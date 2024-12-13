// package .vscode.RECURSION;
// print from 5 to 1
public class Recursion1 {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }
}
