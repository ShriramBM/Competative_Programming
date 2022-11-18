import java.util.Arrays;

import javax.xml.transform.Source;

class Student implements Comparable<Student>{
    int roll;
    String name;
    String stnd;

    Student(int roll, String name, String stnd){
        this.roll = roll;
        this.name = name;
        this.stnd = stnd;
    }

    @Override
    public int compareTo(Student o) {
        if(this.roll == o.roll)
            return 0;
        else if(this.roll>o.roll)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

}



public class SortObject {
   public static void main(String[] args) {
    

        Student arr[] = new Student[4];
        arr[0] = new Student(50, "sfas", "sdfas");
        arr[1] = new Student(12, "sfa", "asfda");
        arr[2] = new Student(563, "sdfsd", "erytr");    
        arr[3] = new Student(12,"asd", "sdfa");

        Arrays.sort(arr);

        for(Student s: arr){
            System.out.println(s.roll+" "+s.name);
        }

   } 
}
