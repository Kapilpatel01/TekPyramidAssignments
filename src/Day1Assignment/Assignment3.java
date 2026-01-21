package Day1Assignment;

import java.util.Scanner;

public class Assignment3 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("Total number of consonants: " + getConsonants(str));
        }
        static int getConsonants(String str){
            int count = 0;

            // Convert string to lowercase
            str = str.toLowerCase();

            // Traverse each character
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check for consonants
                if (ch >= 'a' && ch <= 'z' &&
                        ch != 'a' && ch != 'e' && ch != 'i' &&
                        ch != 'o' && ch != 'u') {
                    count++;
                }
            }

            return count;
        }
    }

