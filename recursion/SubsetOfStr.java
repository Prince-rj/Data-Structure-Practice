public class SubsetOfStr {
    public static void subset(String str,String in, int index){
        if(index>=str.length()){
            System.out.println(in);
            return;
        }
        // System.out.println(in+str.charAt(index));
        String st=in+str.charAt(index);
        subset(str, in, ++index);
        subset(str,st,index);
    }
    public static void main(String[] args) {
        String str="ABC";
        subset(str,"",0);
    }
}
