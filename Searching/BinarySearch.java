import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch{

    public static int binarySer(int arr[],int l,int r,int x){
        if(l<=r){
            int mid=l+r/2;
            if(x<arr[mid]){
                return binarySer(arr, l, mid-1, x);
            }
            else if(x==arr[mid]){
                return mid;
            }
            else{
                return binarySer(arr, mid+1, r, x);
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();            
        }

        System.out.println("Enter no. to search");
        int x=sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        System.out.println(binarySer(arr, 0, n, x)); 



    }
}