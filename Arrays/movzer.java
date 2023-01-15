public class movzer {
    public static void main(String[] args) {
        int arr[]={4,56,0,2,3,0,5,0,0,8};
        int i=0,j=0;
        while(j<arr.length&&i<arr.length){
            if(arr[i]==0&&arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else
            if(arr[i]==0){
                // j=i;
                j++;
            }else{
                i++;
                j=i;
            }
            
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
