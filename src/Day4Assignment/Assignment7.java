package Day4Assignment;
//Largest Element (No Sorting)
public class Assignment7 {

        public static void main(String[] args) {
            int[] arr = {5,7,1,9};
            int max = arr[0];

            for(int i=1;i<arr.length;i++)
                if(arr[i]>max) max=arr[i];

            System.out.println(max);
        }
    }

