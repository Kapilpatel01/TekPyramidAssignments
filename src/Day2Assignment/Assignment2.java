package Day2Assignment;

public class Assignment2 {

        public static void findMinMax(String str) {
            int[] freq = new int[256];

            for (char c : str.toCharArray()) {
                freq[c]++;
            }

            char minChar = str.charAt(0), maxChar = str.charAt(0);
            int min = freq[minChar], max = freq[maxChar];

            for (char c : str.toCharArray()) {
                if (freq[c] < min) {
                    min = freq[c];
                    minChar = c;
                }
                if (freq[c] > max) {
                    max = freq[c];
                    maxChar = c;
                }
            }

            System.out.println("Minimum occurring char: " + minChar);
            System.out.println("Maximum occurring char: " + maxChar);
        }

        public static void main(String[] args) {
            findMinMax("success");
        }
    }

