package Day4Assignment;
//Left Rotate by 2
public class Assignment3 {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int k = 2;

            for(int i=0;i<k;i++){
                int first = arr[0];
                for(int j=0;j<arr.length-1;j++)
                    arr[j]=arr[j+1];
                arr[arr.length-1]=first;
            }

            for(int x:arr) System.out.print(x+" ");
        }
    }

