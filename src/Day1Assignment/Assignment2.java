package Day1Assignment;

import java.util.Scanner;

public class Assignment2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Total number of vowels: " + getVowels(str));
    }

    public static int getVowels(String str){

                int count = 0;

                // Convert string to lowercase for easy comparison
                str = str.toLowerCase();

                // Traverse each character
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                            ch == 'o' || ch == 'u') {
                        count++;
                    }
                }

                return count;
            }
        }
