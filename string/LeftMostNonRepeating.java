import java.util.Scanner;
public class LeftMostNonRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
