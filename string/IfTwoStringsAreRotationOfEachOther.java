import java.util.Scanner;
public class IfTwoStringsAreRotationOfEachOther {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String added=s1+s1;
        // boolean isRotation=false;
        // for(int i=0;i<added.length();i++){
            
        // }
        //what is the code associated with contains how can we make a function like that and also in the least possible complexity.
        if(added.contains(s2)){
            System.out.println(true);
        }
        else{

            System.out.println(false);
        }

    }
}
