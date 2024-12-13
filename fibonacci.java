public class fibonacci {

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.println("Fibbonacci series upto " + maxNumber + "is : ");
        for (int i = 0; i < maxNumber; i++) {
            System.out.print(fibo(i) + " ");

        }
    }
}