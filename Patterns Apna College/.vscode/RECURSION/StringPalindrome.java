public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
    }

    public static void stringPal(String s, int x, int y) {
        char c[] = s.toCharArray();

        rev(x, y, c);

        stringPal(s, x, y);
    }

    public static void rev(int x, int y, char c[]) {
        char c1 = c[x];
        c[x] = c[y];
        c[y] = c1;
    }
}
