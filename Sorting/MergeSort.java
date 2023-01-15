import java.util.Arrays;
import java.util.Scanner;
class MergeSort{
    public static void merge(int arr[],int l,int mid,int r){
        int L[]=new int[mid+1-l];
        int R[]=new int[r-mid];
        int s=mid+1;
        for(int i=0;i<L.length;i++){
            L[i]=arr[l+i];
            
        }
        for (int i = 0; i < R.length; i++) {
            R[i]=arr[s+i];
        }
        // System.out.println(Arrays.toString(R)+"\n"+Arrays.toString(L));
        int j=0;
        int n=L.length;
        int k=0;
        int m=R.length;
        for(int i=l;i<m+n;i++){
            if(j>=n){
                // System.out.println(j+" "+k+"i is : "+i);
                arr[i]=R[k];
                k++;
            }
            else if(k>=m){
                arr[i]=L[j];
                j++;
            }
            else if(L[j]>R[k]){
                arr[i]=R[k];
                k++;
            }
            else if(L[j]<R[k]){
                arr[i]=L[j];
                j++;
            }
        }
        // System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[],int l,int r){
        if(r>l){
             int mid=l+(r-l)/2;
            //  System.out.println("in mergesort");
             mergeSort(arr,l,mid);
             mergeSort(arr,mid+1,r);
             merge(arr,l,mid,r);
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
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}