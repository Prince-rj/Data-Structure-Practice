import java.util.Scanner;
import java.util.HashMap;


public class CountFrequencyOptimized {
    public static HashMap<Integer,Integer> frequency(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : arr) {
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        return hm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of the array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(frequency(arr));


    }
}
