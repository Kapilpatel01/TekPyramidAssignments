package Day4Assignment;
//Prime Number
public class Assignment17 {
        public static void main(String[] args) {
            int n=29, count=0;
            for(int i=1;i<=n;i++)
                if(n%i==0) count++;

            System.out.println(count==2?"Prime":"Not Prime");
        }
    }

