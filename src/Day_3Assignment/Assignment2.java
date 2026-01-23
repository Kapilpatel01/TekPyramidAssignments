package Day_3Assignment;

import java.util.HashSet;

public class Assignment2 {
        public static void main(String[] args) {
            String s = "Java is java and Java is powerful";
            String[] words = s.toLowerCase().split(" ");

            HashSet<String> set = new HashSet<>();
            HashSet<String> duplicates = new HashSet<>();

            for (String word : words) {
                if (!set.add(word)) {
                    duplicates.add(word);
                }
            }
            System.out.println(duplicates);
        }
    }

