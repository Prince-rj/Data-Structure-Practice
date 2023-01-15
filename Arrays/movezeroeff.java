public class movezeroeff {
    public static void main(String[] args) {
        int arr[]={12,0,2,0,2,5,1,5,6,0,6,1,0,521,0,0,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
