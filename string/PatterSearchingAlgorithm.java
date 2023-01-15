import java.util.Scanner;
public class PatterSearchingAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean found=true;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    found=false;
                    break;
                }
                else{
                    found=true;
                }
            }
            if(found){
                System.out.println(i);
            }
        }
    }
}
