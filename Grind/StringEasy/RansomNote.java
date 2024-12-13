package StringEasy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aba";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int flag = 0;

        for (char C : magazine.toCharArray()) {
            if (!map.containsKey(C)) {
                System.out.println("false");
            }

            else if (map.containsKey(C) && map.get(C) > 1) {
                map.put(C, map.get(C) - 1);
            } else if (map.get(C) == 0) {
                System.out.println("false");
                flag = 1;
            } else {
                System.out.println("true final");
            }
        }
    }
}
