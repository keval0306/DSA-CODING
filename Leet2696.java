
// Minimum String Length After Removing Substrings

// Input: s = "ABFCACDB"
// Output: 2
// Explanation: We can do the following operations:
// - Remove the substring "ABFCACDB", so s = "FCACDB".
// - Remove the substring "FCACDB", so s = "FCAB".
// - Remove the substring "FCAB", so s = "FC".
// So the resulting length of the string is 2.
// It can be shown that it is the minimum length that we can obtain.

import java.util.Stack;

public class Leet2696 {
    public static void main(String[] args) {
        String s = "D";
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            System.out.println(" character :" + character);
            if ((stack.size() > 0)
                    && (character == 'B' && stack.peek() == 'A' || character == 'D' && stack.peek() == 'C')) {
                stack.pop();
            } else {
                stack.push(character);
            }
        }
        System.out.println(stack.size());
    }
}
