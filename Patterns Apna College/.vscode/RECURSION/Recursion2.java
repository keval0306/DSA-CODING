// package .vscode.RECURSION;

public class Recursion2 {
    public static void main(String[] args) {
        // print 1 to 5
        // printNum(1);

        // QUES 2.

        // int sum = 0;
        // sumOfNums(1, 5, sum);

        // QUES 3 : FACTPRIAL OF NUM
        // int ans = fact(5);
        // System.out.println(ans);

        // QUES 4 : FIBONACCI
        // int a = 0;
        // int b = 1;
        // int n = 7;
        // System.out.print(a + " " + b + " ");
        // printFiboo(a, b, n - 2);

        int i = 1;
        int n = 10;
        printLinear1ToN(n);

    }

    // // print 1 to 5

    public static void printNum(int n) {

        if (n == 6)
            return;
        System.out.println(n);
        printNum(n + 1);
    }

    // QUE 2.) : sum of first n natural numbers.
    public static void sumOfNums(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumOfNums(i + 1, n, sum);
    }

    // QUE 3 .) :FACTORIAL OF NUM

    public static int fact(int num) {
        if (num == 1 || num == 0)
            return 1;

        int factnm1 = fact(num - 1);
        int fact = num * factnm1;
        return fact;
    }

    // QUES 4 :) FIBONACCI SERIES

    public static void printFiboo(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFiboo(b, c, n - 1);
    }

    public static void printLinear1ToN(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printLinear1ToN(n - 1);
    }
}
