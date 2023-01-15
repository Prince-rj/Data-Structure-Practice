import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int ElementToBeInserted=arr[i+1];
            int j=i;
            while(j>=0&&arr[j]>ElementToBeInserted){
                arr[j+1]=arr[j];
                    j--;
            }
            arr[j+1]=ElementToBeInserted;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
