package Day4Assignment;
//Perfect Number
public class Assignment23 {

        public static void main(String[] args) {
            int n=28,sum=0;

            for(int i=1;i<n;i++)
                if(n%i==0) sum+=i;

            System.out.println(sum==n);
        }
    }

