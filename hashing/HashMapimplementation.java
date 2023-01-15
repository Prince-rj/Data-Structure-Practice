import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class HashMapimplementation {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("one",1);
        hm.put("two",2);
        hm.put("three",3);
        System.out.println(hm);
        // Set<Entry<String,Integer>> mp=hm.entrySet();
        for(Entry<String,Integer> m:hm.entrySet()){
            System.out.println(m.getValue());
        }
    }
}
