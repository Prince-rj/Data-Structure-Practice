//Given an array of elements find the no. of distinct elements in the array.
import java.util.HashSet;
import java.util.Scanner;

public class DistinctElementProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int distinctElements=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i: arr) {
            if(hs.add(i)==true){
                distinctElements++;
            }
        }
        System.out.println("total no. of distinct elements are: " + distinctElements);
    }
}
