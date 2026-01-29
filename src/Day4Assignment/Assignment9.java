package Day4Assignment;
//3rd Largest Element
public class Assignment9 {

        public static void main(String[] args) {
            int[] arr = {10,50,20,40,30};

            int f=Integer.MIN_VALUE, s=Integer.MIN_VALUE, t=Integer.MIN_VALUE;

            for(int x:arr){
                if(x>f){ t=s; s=f; f=x; }
                else if(x>s){ t=s; s=x; }
                else if(x>t){ t=x; }
            }
            System.out.println(t);
        }
    }

