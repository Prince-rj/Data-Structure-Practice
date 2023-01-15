import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class hashmapimp {
    static class hashMap{
        int size;
        LinkedList<Integer>[] a;
        hashMap(int size){
            a=new LinkedList[size];
            this.size=size;
            for(int i=0;i<size;i++){
                a[i]=new LinkedList<>();
            }
        }
        public void insert(int data){
            int i=data%size;
            a[i].add(data);
        }
        public void print(){
            for (LinkedList<Integer> linkedList : a) {
                    System.out.println(linkedList);
            }
        }
   }
    
    public static void main(String[] args) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            if(e.getValue()%2!=0){
                odd=true;
                hm.put(e.getKey(),e.getValue()-1);
            }
        }
        h.insert(12);
        h.insert(120);
        h.insert(102);
        h.insert(2);
        h.insert(1);
        h.print();
    }
}