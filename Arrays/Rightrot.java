public class Rightrot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=1;i<arr.length;i++){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
