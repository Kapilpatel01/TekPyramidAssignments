package Day_3Assignment;

public class Assignment9 {
        public static void main(String[] args) {
            String s1 = "abcd";
            String s2 = "cdab";

            boolean isRotation = s1.length() == s2.length() && (s1 + s1).contains(s2);

            System.out.println(isRotation);
        }
    }

