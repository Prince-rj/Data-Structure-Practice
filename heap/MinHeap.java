/**
 * Heap
 */

public class MinHeap {
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    int arr[];
    int size;
    int capacity;
    MinHeap(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }
    int getLeft(int index){
        return 2*index+1;
    }
    int getRight(int index){
        return 2*index+2;
    }
    int getParent(int index){
        return (index-1)/2;
    }
    void insert(int data){
        if(size>=capacity){
            System.err.println("\u001B[31m"+"Capacity exceeded"+"\u001B[0m");
            return;
        }
        arr[size]=data;
        int i=size;
        size++;
        while(i>0){
            int par=getParent(i);
            if(arr[par]>arr[i]){
                swap(arr,par,i);
                i=par;
            }
            else{
                return;
            }
        }
        
    }
}