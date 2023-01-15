import java.util.Arrays;
import java.util.Scanner;

/**
 * Heapify
 */
public class Heapify {
    static int size=0;
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
    public static void heapify(int arr[],int i){
        int n=arr.length;
        int greater=i;
        // recursive:
        // if(i*2+1<n&&arr[greater]<arr[i*2+1])greater=i*2+1;
        // if(i*2+2<n&&arr[greater]<arr[i*2+2])greater=i*2+2;
        //  if(greater!=i){
        //     swap(arr,greater,i);
        //     heapify(arr,greater);
        // }
        //iterative:
        //        1
        //   2         3
        //4    5    6     7
        while(true){
            i=greater;
            if(i*2+1<n&&arr[greater]<arr[i*2+1])greater=i*2+1;
            if(i*2+2<n&&arr[greater]<arr[i*2+2])greater=i*2+2;
            if(i==greater)return;
            swap(arr,greater,i);
        }
        
    }
    public static int extract(int arr[]){
        if(size==0){
            return Integer.MAX_VALUE;
        }
        if(size==1)return arr[0];
        int n=arr.length;
        swap(arr,0,n-1);
        int data=arr[n-1];
        arr[n-1]=Integer.MIN_VALUE;
        size--;
        heapify(arr, 0);
        return data;
    }
    public static void buildheap(int []arr,int i){
        int n=arr.length;
        if(i>(n-2)/2)return;
        int left=2*i+1;
        int right=2*i+2;
        buildheap(arr,left);
        buildheap(arr,right);
        heapify(arr,i);
    }
    public static void buildheap(int[] arr){
        int n=arr.length;
        int p=(n-2)/2;
        for(int i=p;i>=0;i--){
            heapify(arr,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        size=n;
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before"+"\u001B[31m"+Arrays.toString(arr)+"\u001B[0m");
        buildheap(arr);
        // extract(arr);
        // extract(arr);
        // extract(arr);
        // extract(arr);
        System.out.println(extract(arr));
        System.out.println(extract(arr));
        // System.out.println(extract(arr));
        // System.out.println(extract(arr));
        // System.out.println(extract(arr));
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        


    }
}