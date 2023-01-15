import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(1);
        arr.add(2);
        arr.add(102);
        arr.add(120);
        //for normal order
        // Collections.sort(arr);
        //for reverse order
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        

    }
}
