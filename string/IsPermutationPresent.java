import java.util.Scanner;

public class IsPermutationPresent {
    public static boolean isanagram(String S1,String S2){
        int arr[]=new int[256];
        if(S1.length()!=S2.length()){
            return false;
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
               return flag;
            
        }
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        boolean pre=false;
        for(int i=0;i<s1.length()-m;i++){
            String word="";
            for(int j=i;j<m+i;j++){
                word+=s1.charAt(j);
            }
            // System.out.println(word);
            if(isanagram(word, s2)){
                pre=true;
                break;
            }
        }
        System.out.println(pre);
    }
}
