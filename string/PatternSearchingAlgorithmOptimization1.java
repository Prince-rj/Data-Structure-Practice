import java.util.Scanner;
public class PatternSearchingAlgorithmOptimization1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean found=true;
        for(int i=0;i<s1.length();){
            int j;
            for(j=0;j<s2.length();j++){
                
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    found=false;
                    break;
                }
                else{
                    found=true;
                }
            }
            if(found==true){
                System.out.println(i);
            }
            if(j==0){
                i++;
            }
            else{
                i+=j;
            }
        }
    }
}
