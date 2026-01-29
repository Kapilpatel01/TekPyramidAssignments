package Day4Assignment;

import java.util.Scanner;

//Java Program to Find the Frequency of Elements in an Array
public class Assignment2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       getFrequency(a);



    }
    public static void getFrequency(int[] a){
        int min=a[0];
        int max=a[0];
        for(int x:a){
            if(x>max)
                max=x;
            else if(min>x)
                min=x;
        }
        int[] freq=new int[max-min+1];
        for(int i=0;i<a.length;i++){
            freq[a[i]-min]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
                System.out.println(i+min+" is : "+freq[i]+" times");
        }
    }

}
