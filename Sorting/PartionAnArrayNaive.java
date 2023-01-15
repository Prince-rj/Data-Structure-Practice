import java.util.Arrays;
import java.util.Scanner;

public class PartionAnArrayNaive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index of element to partition from: ");
        int p=sc.nextInt();
        int arrtemp[]=new int[n];
        int l=0;
        
        for(int i=0;i<n;i++){
            if(arr[p]>arr[i]){
            arrtemp[l]=arr[i];
            l++;
            }
        }
        arrtemp[l]=arr[p];
        l++;
        for(int j=0;j<n;j++){
            if(arr[p]<arr[j]){
                arrtemp[l]=arr[j];
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrtemp));
    }
}
