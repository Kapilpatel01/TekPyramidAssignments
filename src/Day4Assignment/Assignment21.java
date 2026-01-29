package Day4Assignment;
//Java Program to Find LCM
public class Assignment21 {
        public static void main(String[] args) {
            int a = 12;
            int b = 18;
            int lcm;

            int max = (a > b) ? a : b;

            while (true) {
                if (max % a == 0 && max % b == 0) {
                    lcm = max;
                    break;
                }
                max++;
            }

            System.out.println("LCM = " + lcm);
        }
    }

