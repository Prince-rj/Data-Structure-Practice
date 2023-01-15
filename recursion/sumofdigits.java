public class sumofdigits {
    public static int sumofdigits(int n){
        if(n==0){
            return n;
        }
        return  n%10+sumofdigits(n/10);
    }
    public static void main(String[] args) {
        System.out.println( sumofdigits(909));
    }
}
