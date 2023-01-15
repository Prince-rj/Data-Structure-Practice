import java.util.Scanner;
public class IsPermutationPresentOptimization {
    public static boolean areSame(int arr1[],int arr2[]){
        for(int i=0;i<256;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        boolean pre=false;
        int stringCountArr[]=new int[256];
        int perCountArr[]=new int[256];
        for(int i=0;i<m;i++){
            stringCountArr[i]++;
            perCountArr[i]++;
        }
        for(int i=m;i<n;i++){
            if(areSame(stringCountArr,perCountArr)){
                pre=true;
                break;
            }
            stringCountArr[i]++;
            stringCountArr[i-m]--;
        }
        System.out.println(pre);
    }
}
