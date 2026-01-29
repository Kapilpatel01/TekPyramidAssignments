package Day4Assignment;
//1. Largest & Smallest Digit in a Number
public class Assignment1 {
    public static void main(String[] args) {
        int num = 92745;
        int max = 0, min = 9;

        while (num > 0) {
            int digit = num % 10;
            if (digit > max) max = digit;
            if (digit < min) min = digit;
            num /= 10;
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
