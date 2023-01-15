import java.util.Arrays;

class SortPoints{
    public static void main(String[] args) {
        Point arr[]={
            new Point(12, 45),
            new Point(2, 90),
            new Point(89, 5),
            new Point(7, 4),
            new Point(1, 5)
        };
        // Point p=new Point(0,0);
        // Point.mySort mySort=p.new mySort();
        Arrays.sort(arr,new mySort());
        for (Point point : arr) {
            System.out.println(point.x+" "+point.y);
        }
    }
}