/**
 * rev
 */
public class rev {

    public static void main(String[] args) {
        int arr[]={1,2,0,6,0,8,0,58,50,5,0,52};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
    }
}