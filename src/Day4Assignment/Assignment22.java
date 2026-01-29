package Day4Assignment;
//Armstrong Number
public class Assignment22 {

        public static void main(String[] args) {
            int num=153,temp=num,sum=0;

            while(num>0){
                int d=num%10;
                sum+=d*d*d;
                num/=10;
            }
            System.out.println(sum==temp);
        }
    }

