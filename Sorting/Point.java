import java.util.Comparator;
public class Point {
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class mySort implements Comparator<Point>{
    @Override
    public int compare(Point o1,Point o2) {
        return o1.x-o2.x;
    }
}
