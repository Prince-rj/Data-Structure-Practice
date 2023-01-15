import java.util.Arrays;
import java.util.Scanner;

public class lomutoPartition {
    public static void swap(int arr[],int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        swap(arr,0, size-1);
        System.out.println(Arrays.toString(arr));
 //         Note: as in lomuto partition the pivot is always taken to be the last 
 //         element so we here take the pivot and swap it with the last element 
 //         and rest of the algorithm works the same
        System.out.println("Enter the index of the pivot");
        int p=sc.nextInt();
        int n=size;
        swap(arr,n-1, p);
        int pivot=arr[n-1];
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
