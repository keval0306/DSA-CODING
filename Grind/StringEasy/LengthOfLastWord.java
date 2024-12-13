package StringEasy;

/*
 Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        // String s = " fly me to the moon ";
        String s = "Hello World";
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
