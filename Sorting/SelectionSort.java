import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min_index;
        for (int i = 0; i < arr.length; i++) {
            min_index=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
