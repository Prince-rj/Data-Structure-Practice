//optimization to count frequency problem where we are going to print the code in ordered manner
import java.util.Scanner;
import java.util.LinkedHashMap;

public class LinkedHashMapCountFrequencyProblem {
    public static LinkedHashMap<Integer,Integer> frequency(int arr[]){
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
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