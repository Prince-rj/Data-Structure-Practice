import java.util.Arrays;
import java.util.Scanner;

public class QuickSortHoares {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int arr[],int l,int h){
        int i=l;
        int j=h;
        int mid=l;
        while(true){
            //here using the do while loop we can increase the efficiency and also that helps us achieve faster speed than that of lomuto partition.
            do{
                i++;
            }while(i<=h&&arr[i]<arr[mid]);
            do{
                j--;
            }while(j>=l&&arr[j]>arr[mid]);
            if(i>=j){
                return j;
            }
                swap(arr,i,j);
        }

    }
    public static void qSort(int arr[],int l,int h){
        if(l<h){
            int pivot=partition(arr,l,h);
            qSort(arr, l, pivot);
            qSort(arr,pivot+1,h);
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
        System.out.println("After Sorting:\n"+Arrays.toString(arr));
    }
}