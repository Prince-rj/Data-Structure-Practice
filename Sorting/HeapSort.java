import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    static class Heap{
        static int size;
        static void swap(int arr[], int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        static void heapify(int arr[],int i){
            int largest=i;
            
            // if(arr[left]>largest)largest=arr[left];
            // if(arr[right]>largest)largest=arr[right];
            while(true){
                i=largest;
                int left=i*2+1;
                int right=i*2+2;
                if(left<size && arr[left]>arr[largest])largest=left;
                if(right<size && arr[right]>arr[largest])largest=right;
                if(largest!=i){
                    swap(arr,i,largest);
                }
                else{
                    break;
                }
            }
        }
        static int extract(int arr[]){
            if(size==0){
                return Integer.MIN_VALUE;
            }
            if(size==1){
                return arr[0];
            }
            int data=arr[0];
            swap(arr,0,size-1);
            size--;
            heapify(arr, 0);
            return data;
        }
        static void buildHeap(int arr[]){
            int n=arr.length;
            size=n;
            System.out.println((n-2)/2);
            for(int i=(n-2)/2;i>=0;i--){
                heapify(arr,i);
            }
        }
    }
    public static void heapSort(int arr[]){
        int n=arr.length;
        Heap.buildHeap(arr);
        for(int i=n-1;i>=0;i--){
            arr[i]=Heap.extract(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
