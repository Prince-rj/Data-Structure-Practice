//Reflection in java
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class ArraysClass{
    public static void main(String[] args){
        Integer arr[]={1,2,3,4,2,1,4,54,5,3};
        // Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,8,9);
        System.out.println(Arrays.toString(arr));
    }
}