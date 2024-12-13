import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = sc.nextInt();

        System.out.println("LCM OF NO1 AND NO2 IS :" + lcm(n1, n2));

    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}