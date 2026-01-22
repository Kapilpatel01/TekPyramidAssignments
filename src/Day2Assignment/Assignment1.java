package Day2Assignment;

public class Assignment1 {
        public static void printSubsets(String str) {
            int n = str.length();

            for (int i = 0; i < n; i++) {
                String temp = "";
                for (int j = i; j < n; j++) {
                    temp += str.charAt(j);
                    System.out.println(temp);
                }
            }
        }

        public static void main(String[] args) {
            printSubsets("FUN");
        }
    }

