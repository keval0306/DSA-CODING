public class NUM_PRINT_WITHOUT_LOOP {

    public static void num(int start, int end) {
        if (start > end) {
            return;
        } else {
            System.out.println(start);
            num(start + 1, end);
        }

    }

    public static void main(String[] args) {
        num(1, 10);

    }
}
