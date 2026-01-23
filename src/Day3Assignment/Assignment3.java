package Day3Assignment;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment3 {

        public static void main(String[] args) throws Exception {
            File file = new File("tek.txt");
            Scanner sc = new Scanner(file);

            HashMap<String, Integer> map = new HashMap<>();

            while (sc.hasNext()) {
                String word = sc.next().toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            String maxWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxWord = entry.getKey();
                }
            }

            System.out.println(maxWord + " → " + maxCount);
        }
    }

