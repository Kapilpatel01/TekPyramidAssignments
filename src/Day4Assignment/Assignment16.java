package Day4Assignment;
//16 Intersection of Two Arrays
public class Assignment16 {
        public static void main(String[] args) {
            int[] a={1,2,3};
            int[] b={2,3,4};

            for(int x:a)
                for(int y:b)
                    if(x==y)
                        System.out.println(x);
        }
    }

