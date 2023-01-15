import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array1: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2: ");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter the elements of array2: ");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int a[]=new int[m+n];
        int j=0;
        int k=0;
        for(int i=0;i<(n+m);i++){
            if(j>=n){
                a[i]=arr2[k];
                k++;
            }
            else if(k>=m){
                a[i]=arr[j];
                j++;
            }
            else
            if(arr[j]<arr2[k]){
                a[i]=arr[j];
                j++;
            }
            else{
                a[i]=arr2[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
