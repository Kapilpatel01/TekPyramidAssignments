package Day4Assignment;
//2nd Largest Element
public class Assignment8 {

        public static void main(String[] args) {
            int[] arr = {10,20,5,40};

            int largest = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for(int x:arr){
                if(x>largest){
                    second=largest;
                    largest=x;
                }else if(x>second && x!=largest){
                    second=x;
                }
            }
            System.out.println(second);
        }
    }

