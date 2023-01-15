import java.util.Scanner;
import java.util.Arrays;
public class QuickSort {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int arr[], int l,int h){
        int i=l;
        for(int j=l;j<h;j++){
            if(arr[j]<=arr[h]){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,h);
        return i;
    }
    public static void qSort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
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
        System.out.println("Before sorting:\n"+Arrays.toString(arr));
        
        qSort(arr,0,size-1);
        System.out.println("After sorting:\n"+Arrays.toString(arr));
    }
}
