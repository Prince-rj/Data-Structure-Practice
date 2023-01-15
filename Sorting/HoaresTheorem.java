import java.util.Arrays;
import java.util.Scanner;
/**
 * Hoare'sTheorem
 */
public class HoaresTheorem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index of pivot: ");
        int pivot=sc.nextInt();
        int i=0;
        int j=n-1;
        while(i<j){
            while(arr[i]<arr[pivot]){
                i++;
            }
            while(arr[j]>arr[pivot]){
                j--;
            }
            if(i<j){
                lomutoPartition.swap(arr,i,j);
            }
        }
        // lomutoPartition.swap(arr,j,pivot);
        System.out.println( Arrays.toString(arr));
    }
}