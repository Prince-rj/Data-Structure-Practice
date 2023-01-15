import java.util.Arrays;

public class Ropemax {
    public static int Ropes(int n,int a,int b,int c){
        if(n<=0){
            return n;
        }
        else{
            int x= Math.max(Math.max(Ropes(n-a,a,b,c),Ropes(n-b,a,b,c)),Ropes(n-c,a,b,c));
            return (x<0)?-1:x+1;    
        }
        
    }
    public static void main(String[] args) {
        int a=2,b=5,c=1;
        System.out.println(Ropes(5,a,b,c));
    }
}
