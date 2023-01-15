//in implementation of hash map in cpp or java the use pointers and references and a dummynode
//is made and the pointer is pointed to that and we check for that in during implementation
public class HashMap {
    int arr[];
    int size;
    HashMap(int n){
    arr=new int[n];
    size=n;
    for (int i = 0; i < arr.length; i++) {
        arr[i]=-1;
        
    }
    
    }
    public void insert(int key){
        int probe=key%size;
        int offset=(size-1)-(key%(size-1));
        while(arr[probe]!=-1&&arr[probe]!=-2&&arr[probe]!=key){
            probe=(probe+offset)%size;
        }
        arr[probe]=key;
    }
    public int search(int key){
        int probe=key%size;
        int offset=(size-1)-(key%(size-1));
        while(arr[probe]!=-1){
            if(arr[probe]==key){
                return probe;
            }
            probe=(probe+offset)%size;
            if(probe==key%size){
                return -1;
            }
        }
        return -1;

    }
    public void delete(int key){
        if(search(key)!=-1)
        arr[search(key)]=-2;
        
    }
}
