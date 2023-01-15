import java.util.Scanner;

public class AnagramOptimization2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S1=sc.nextLine();
        String S2=sc.nextLine();
        int arr[]=new int[256];
        if(S1.length()!=S2.length()){
            System.out.println(false);
        }
        else{
            for(int i=0;i<S1.length();i++){
                arr[S1.charAt(i)]++;
            }
            for(int i=0;i<S2.length();i++){
                arr[S2.charAt(i)]--;
            }
            boolean flag=true;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    flag=false;
                    break;
                }
            }
                System.out.println(flag);
            
        }
    }
}
