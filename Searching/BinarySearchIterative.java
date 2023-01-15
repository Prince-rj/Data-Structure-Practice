import java.util.Scanner;
import java.util.Arrays;
class BinarySearchIterative{
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
        int i=0;
        int j=n-1;
        boolean found=false;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==x){
                System.out.println("Element found at: "+mid);
                found=true;
                break;
            }
            else if(x<arr[mid]){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}