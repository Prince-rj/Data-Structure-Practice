import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String S1,String S2){
        if(S1.length()!=S2.length())return false;
        if(S1.equals(S2))return true;
        char[] c1=new char[S1.length()];
        char[] c2=new char[S2.length()];
        for(int i=0;i<S1.length();i++){
            c1[i]=S1.charAt(i);
        }
        for(int i=0;i<S2.length();i++){
            c2[i]=S2.charAt(i);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1="";
        String s2="";
        for (char c : c1) {
            s1+=c;
        }
        for (char c : c2) {
            s2+=c;
        }
        if(s1.equals(s2))
        return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S1=sc.nextLine();
        String S2=sc.nextLine();
        System.out.println(isAnagram(S1,S2));
    }
}