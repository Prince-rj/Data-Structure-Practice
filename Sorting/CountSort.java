import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    static void countSort(int arr[],int n,int k){
        int count[]=new int[k];
        for(int i=0;i<n;i++){
                count[arr[i]]++;
        }

        for(int i=0,j=0;i<k;){
            if(count[i]==0){
                i++;
            }
            else{
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the range of nos.in array: ");
        int k=sc.nextInt();
        countSort(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
}
