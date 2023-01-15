import java.util.Arrays;

public class MinHeapImp {
    public static void main(String[] args) {
        MinHeap mh=new MinHeap(9);
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(50);
        mh.insert(100);
        mh.insert(25);
        mh.insert(40);
        mh.insert(45);
        mh.insert(1);
        mh.insert(12);
        System.out.println(Arrays.toString(mh.arr));
    }
}
