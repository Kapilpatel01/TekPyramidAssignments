package Day4Assignment;
//14 Maximum Subarray Sum (Kadane brute)
public class Assignment14 {

        public static void main(String[] args) {
            int[] arr={-2,1,-3,4,-1,2,1};

            int max=arr[0], current=arr[0];
            for(int i=1;i<arr.length;i++){
                current=Math.max(arr[i],current+arr[i]);
                max=Math.max(max,current);
            }
            System.out.println(max);
        }
    }

