package Day4Assignment;
// Right Rotate by 2
public class Assignment4 {

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int k = 2;

            for(int i=0;i<k;i++){
                int last = arr[arr.length-1];
                for(int j=arr.length-1;j>0;j--)
                    arr[j]=arr[j-1];
                arr[0]=last;
            }

            for(int x:arr) System.out.print(x+" ");
        }
    }

