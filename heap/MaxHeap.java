public class MaxHeap {
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    int arr[];
    int capacity;
    int size;
    MaxHeap(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }   
    int getLeft(int index){
        return index*2+1;
    }
    int getRight(int index){
        return index*2+2;
    }
    int getParent(int index){
        return (index-1)/2;
    }
    void insert(int data){
        if(size>=capacity){
            System.err.println("\u001B[31m"+"Capacity exceeded"+"\u001B[0m");
            return;
        }
        int i=size;
        arr[i]=data;
        size++;
        while(i>0){
            int parent=getParent(i);
            if(arr[i]>arr[parent]){
                swap(arr,i,parent);
                i=parent;
            }
            else{
                return;
            }
        }
        
    }
    void heapify(int i){
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
    void decreaseKey(int i,int data){
        arr[i]=data;
        while(i>0){
            int parent=(i-1)/2;
                if(arr[i]> arr[parent]){
                    swap(arr,parent,i);
                }
                i=parent;
        }
    }
    int extract(){
        if(size==0){
            return Integer.MAX_VALUE;
        }
        if(size==1){
            return arr[0];
        }
        int data=arr[0];
        swap(arr,0,size-1);
        size--;
        heapify(0);
        return data;
    }
    void deleteKey(int i){
        if(i<size){   
            decreaseKey(i, Integer.MIN_VALUE);
            swap(arr,i,size-1);
            size--;
            heapify(0);
        }
        else return;
    }
    
}
