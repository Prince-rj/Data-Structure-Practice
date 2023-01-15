import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * SortStudents
 */
class Student{
    String StudentName;
    int Marks;
    Student(String StudentName,int Marks){
        this.StudentName=StudentName;
        this.Marks=Marks;
    }
}
class Sortit implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        // if(o1.Marks-o2.Marks==0)
        //     return o1.StudentName.compareTo(o2.StudentName);
        // else
            return o1.Marks-o2.Marks;
    }
}
public class SortStudents {
    public static void main(String[] args) {
        ArrayList<Student> Students=new ArrayList<>();
        Students.add(new Student("Ram",40));
        Students.add(new Student("Shyam",50));
        Students.add(new Student("Sohan",45));
        Students.add(new Student("Taran",100));
        Students.add(new Student("karan",100));
        Students.add(new Student("Arun",100));
        Collections.sort(Students,new Sortit());
        for(Student s:Students){
            System.out.println(s.StudentName+" "+s.Marks);
        }
    }
}