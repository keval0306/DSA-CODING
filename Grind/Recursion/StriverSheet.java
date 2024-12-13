package Recursion;

public class StriverSheet {

    // 1.)print namw 5 times
    static int count = 0;

    public static void main(String[] args) {
        // que1();

        // ques2(1, 5);

        // ques3(5);

        // int sum = 0;
        // ques4(5, sum);

        // int x = ques4alter(5);
        // System.out.println(x);

        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println("before reverse :");
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // reverse(0, arr.length - 1, arr);
        // System.out.println("after reverse :");
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        int x = 5;
        int y = 4;
        swap(x, y);
        System.out.println(x + " " + y);
    }

    static void que1() {
        if (count == 5)
            return;
        System.out.println("keval");
        count++;
        que1();
    }

    // 2.) print linearly from 1 to n
    static void ques2(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        ques2(i + 1, n);
    }

    // 3.) print linearly from n to 1
    static void ques3(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        ques3(n - 1);
    }

    // 4.) sum of first n numbers
    static void ques4(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }

        sum = sum + n;
        ques4(n - 1, sum);
    }

    static int ques4alter(int n) {
        if (n == 0) {
            return 0;
        }

        return n + ques4alter(n - 1);
    }

    // 5.) reverse array using recursion
    static void reverse(int s, int r, int arr[]) {
        if (s < r) {
            System.out.println("in recur method:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            return;
        }
        swap(arr[s], arr[r]);
        reverse(s + 1, r - 1, arr);
    }

    static void swap(int x, int y) {

        int temp = x;
        x = y;
        y = temp;
        System.out.println(temp + " " + x + " " + y);
    }
}
