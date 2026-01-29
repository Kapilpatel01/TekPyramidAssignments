package Day4Assignment;
//12 Missing Number
public class Assignment12 {

        public static void main(String[] args) {
            int[] arr={1,2,4,5};
            int n=5;
            int sum=n*(n+1)/2;

            int arrSum=0;
            for(int x:arr) arrSum+=x;

            System.out.println(sum-arrSum);
        }
    }

