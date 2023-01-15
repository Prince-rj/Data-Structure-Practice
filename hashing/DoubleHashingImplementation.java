
/**
 * DoubleHashingImplementation
 */
public class DoubleHashingImplementation {
    public static void main(String[] args) {
        
        HashMap hm=new HashMap(7);
        hm.insert(23);
        hm.insert(3);
        hm.insert(76);
        hm.insert(39);
        hm.insert(9);
        hm.insert(319);
        hm.insert(790);
        for (int i : hm.arr) {
            System.out.println(i);
        }
        System.out.println(hm.search(23));
        hm.delete(23);
        System.out.println(hm.search(23));
        hm.insert(51);
        for (int i : hm.arr) {
            System.out.println(i);
        }
        System.out.println(hm.search(9));

        
    }
    
}