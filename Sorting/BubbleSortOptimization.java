import java.util.ArrayList;

public class BubbleSortOptimization {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(17);
        arr.add(50);
        arr.add(31);
        int n=arr.size();
        int iterations=0;
        for(int i=0;i<n;i++){
            boolean Swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr.get(j+1)<arr.get(j)){
                    Integer temp=arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                    Swapped=true;
                }
            }
            iterations++;
            if(!Swapped)break;
        }
        System.out.println(arr);
        System.out.println(iterations);
    }
}