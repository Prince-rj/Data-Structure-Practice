class palindrome{
    public static boolean ispalin(String str,int h,int l){
        if(h<=l){
            return true;
        }
        else if(str.charAt(h)==(str.charAt(l))){
            return ispalin(str, --h, ++l);
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String str="geeks";
        int h=str.length()-1;
        int l=0;
        System.out.println(ispalin(str, h, l));
        
    }
}