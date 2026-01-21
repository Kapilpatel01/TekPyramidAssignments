package Day1Assignment;

import java.util.Scanner;

public class Assignment5 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter number of parts: ");
        int n = sc.nextInt();

        divideString(str, n);
    }

        // Method to divide string into N parts
        public static void divideString(String str, int n) {

            int length = str.length();

            // If string cannot be divided equally
            if (length % n != 0) {
                System.out.println("String cannot be divided into " + n + " equal parts.");
                return;
            }

            int partSize = length / n;
            int start = 0;

            System.out.println("The " + n + " equal parts are:");

            for (int i = 0; i < n; i++) {
                System.out.println(str.substring(start, start + partSize));
                start = start + partSize;
            }
        }


    }

