package Day2Assignment;

public class Assignment4 {

        public static String toggleCase(String str) {
            StringBuilder sb = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c))
                    sb.append(Character.toLowerCase(c));
                else if (Character.isLowerCase(c))
                    sb.append(Character.toUpperCase(c));
                else
                    sb.append(c);
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println(toggleCase("Java ProGRam"));
        }
    }

