import java.util.Scanner;

public class LeftMostNonRepeatingElementOptimization1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int[] arr=new int[256];
        for(int i=0;i<256;i++){
            arr[i]=-1;
        }
        int res=999999999;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==-1){
                arr[s.charAt(i)]=i;
            }
            else{
                arr[s.charAt(i)]=-2;
            }
        }
        for(int i=0;i<256;i++){
            if(arr[i]>=0){
                res=Math.min(res,arr[i]);
            }
        }
        int index=(res==999999999)?-1:res;
        System.out.println(index);
    }
}
