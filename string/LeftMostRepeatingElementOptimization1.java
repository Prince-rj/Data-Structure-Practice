import java.util.Scanner;

public class LeftMostRepeatingElementOptimization1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int arr[]=new int[256];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        int res=257;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==-1){
                arr[s.charAt(i)]=i;
            }
            else{
                res=Math.min(res,arr[s.charAt(i)]);
            }
        }
        int index=(res==257)?-1:res;
        System.out.println(index);
    }
}
