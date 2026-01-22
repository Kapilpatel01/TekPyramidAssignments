package Day2Assignment;

public class Assignment3 {

        public static String replaceSpaces(String str, char ch) {
            return str.replace(' ', ch);
        }

        public static void main(String[] args) {
            String result = replaceSpaces("Java is easy", '-');
            System.out.println(result);
        }
    }
