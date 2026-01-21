package Day1Assignment;

public class Assignment1 {
        static void main() {
            String s1="Hello, world! How are you?";
            int count=0;
            for(int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
                if(punctuationCount(ch))
                    count++;
            }
            System.out.println("total punctuation is : "+count);
        }


        static boolean punctuationCount(char ch){

            if(ch == '!' || ch == '.' || ch == ',' || ch == '?' ||
                    ch == ';' || ch == ':' || ch == '-' || ch == '\'' ||
                    ch == '\"' || ch == '(' || ch == ')')
                return true;
            return false;
        }
    }


