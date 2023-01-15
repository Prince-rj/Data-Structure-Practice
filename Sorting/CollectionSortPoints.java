import java.util.ArrayList;
import java.util.Collections;

/**
 * CollectionSortPoints
 */
public class CollectionSortPoints {

    public static void main(String[] args) {
        ArrayList<Point> arr=new ArrayList<>();
        arr.add(new Point(23, 43));
        arr.add(new Point(3, 4));
        arr.add(new Point(2, 3));
        arr.add(new Point(12, 90));
        arr.add(new Point(45, 87));
        Collections.sort(arr,new mySort());
        for(Point P:arr)
        System.out.println(P.x+" "+P.y);
    }
}