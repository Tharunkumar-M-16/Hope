package Days.Day14;

import java.util.*;

public class FreqChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String a = "aabbsssxcc";
        for (char c : a.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
