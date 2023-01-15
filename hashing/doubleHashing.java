public class doubleHashing {
    public static void insert(int key,int m,int[] a){
        if(/*in case hash table is small*/a.length<m){
            System.out.println("error: The hash must be of size m");
        }
        
        int probe=key%m;
        int offset=((m-1)-key%(m-1));
        while(/*collision*/a[probe]!=0){
            probe=(probe+offset)%m;
        }
        a[probe]=key;
    }
    public static boolean search(int key,int m,int[] a){
        int probe=key%m;
        int offset=(m-1)-key%(m-1);
        while(a[probe]!=0&&probe!=key%m){
            if(a[probe]==key){
                return true;
            }
            probe=(probe+offset)%m;
        }
        return false;

    }
    public static void main(String[] args) {
        int z=11;
        int a[]=new int[z];
        insert(44, 11, a);
        insert(66, 11, a);
        insert(55, 11, a);
        insert(54, 11, a);
        insert(90, 11, a);
        insert(49, 11, a);
        insert(11, 11, a);
        insert(99, 11, a);
        // insert(48, 11, a);
        // insert(47, 11, a);
        // insert(4, 11, a);
        System.out.println(search(1, 11, a));
        for (int i : a) {
            System.out.println(i);
        }

    }
}
