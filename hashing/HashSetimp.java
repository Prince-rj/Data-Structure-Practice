
import java.util.HashSet;
import java.util.Iterator;

public class HashSetimp {
   public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(23);
        hs.add(9);
        hs.add(1);
        hs.add(36);
        Iterator<Integer> i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
        for (Integer integer : hs) {
            System.out.println(integer+" ");
        }
}
}
