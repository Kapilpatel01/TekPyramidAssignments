package Day1Assignment;

import java.util.Scanner;

public class Assignment4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        if (result) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
        // Method to check anagram
        public static boolean isAnagram(String str1, String str2) {

            // Remove spaces and convert to lowercase
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Length check
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] arr2 = str2.toCharArray();

            // Brute-force comparison
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                boolean found = false;

                for (int j = 0; j < arr2.length; j++) {
                    if (ch == arr2[j]) {
                        arr2[j] = '\0'; // mark character as used
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    return false;
                }
            }
            return true;
        }


    }

