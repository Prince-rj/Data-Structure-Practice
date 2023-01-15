import java.util.Scanner;
public class LexigraphicalRank {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int n=S.length();
        // System.out.println(n);
        int fac=factorial(n);
        // System.out.println(fac);
        int arr[]=new int[256];
        int rank=1;
        for(int i=0;i<S.length();i++){
            arr[S.charAt(i)]++;
        }
        for(int i=1;i<256;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<n;i++){
            fac=fac/(n-i);
            rank+=arr[S.charAt(i)-1]*fac;
            for(int j=S.charAt(i);j<256;j++){
                arr[j]--;
            }   
    }
    System.out.println(rank);

    }
}
