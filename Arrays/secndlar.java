/**
 * secndlar
 */
public class secndlar {

    public static void main(String[] args) {
        int arr[]={5,-5};
        int lar=arr[0];
        int secondlar=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                secondlar=lar;
                lar=arr[i];
            }
        }
        System.out.println(secondlar);
    }
}