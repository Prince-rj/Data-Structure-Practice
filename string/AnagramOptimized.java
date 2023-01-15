import java.util.Scanner;

public class AnagramOptimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S1=sc.nextLine();
        String S2=sc.nextLine();
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        if(S1.length()!=S2.length()){
            System.out.println(false);
        }
        else{
            for(int i=0;i<S1.length();i++){
                arr1[S1.charAt(i)]++;
            }
            for(int i=0;i<S2.length();i++){
                arr2[S2.charAt(i)]++;
            }
            boolean flag=true;
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    flag=false;
                    break;
                }
            }
                System.out.println(flag);
            
        }
    }
}
