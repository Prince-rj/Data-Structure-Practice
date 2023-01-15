//given an array which can have duplicate elements count the frequency of the elements that are present in the array.

import java.util.Scanner;
import java.util.HashSet;

public class countFrequency {
    public static int frequency(int[] arr,int value){
        int count=1;
        HashSet<Integer> hs=new HashSet<>();
        for (int i : arr) {
            if(i==value&&!hs.add(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of the array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        HashSet<Integer> hs=new HashSet<>();

        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        for (int i: arr) {
            if(hs.add(i))
            System.out.println(i+" "+frequency(arr,i));
        }

    }
}
