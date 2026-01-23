package Day3Assignment;

public class Assignment1 {
    static void main() {
       String s="I Love Programming";
       reverseString(s);
    }

    static void reverseString(String s){
        String[] str=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();

        for(int i=str.length-1;i>=0;i--){
            result.append(str[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
