import java.util.Arrays;
import java.util.Scanner;

class  student{
    String name;
    int marks;
    student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class CountSortGeneralPurpose {
    static void countSort(student arr[],int n,int k){
        int count[]=new int[k];
        student output[]=new student[n];
        for(int i=0;i<n;i++){
            count[arr[i].marks]++;
        }
        for(int i=1;i<k-1;i++){
            count[i]=count[i-1]+count[i];
        }
        for(int i=n-1;i>=0;i--){
            output[count[arr[i].marks]-1]=arr[i];
            count[arr[i].marks]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
        student s1=new student("A", 12);
        student s2=new student("B", 13);
        student s3=new student("C", 16);
        student s4=new student("D", 15);
        student s5=new student("E", 10);
        int n=5;
        student arr[]=new student[n];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        arr[3]=s4;
        arr[4]=s5;
        for(student s:arr){
            System.out.println("Name: "+s.name+"\t\t Marks: "+s.marks);
        }
        System.out.println("\n\n");
        countSort(arr,n,20);
        for(student s:arr){
            System.out.println("Name: "+s.name+"\t\t Marks: "+s.marks);
        }
    }
}
