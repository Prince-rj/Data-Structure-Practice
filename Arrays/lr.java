/**
 * lr
 */
public class lr {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}