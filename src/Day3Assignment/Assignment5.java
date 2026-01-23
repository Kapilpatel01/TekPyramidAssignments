package Day3Assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment5 {

        public static void main(String[] args) {
            String s = "programming";
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() > 1) {
                    System.out.println(e.getKey() + " = " + e.getValue());
                }
            }
        }
    }

