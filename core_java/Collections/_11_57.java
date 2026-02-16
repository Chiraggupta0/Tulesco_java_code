// use of comparable
//  in previous file we noticed that collection.sort does not work with the objects so we use comparabble instead of comparator

package core_java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return "Student [age=" + age + ", name=" + name + "]";
    } 
    public int compareTo(Student that)
    {
        if(this.age>that.age)
            return 1;
        else return -1;  
    }

}

public class _11_57 {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(21,"chirag"));
        stud.add(new Student(32,"shourya"));
        stud.add(new Student(54,"anuj"));
        stud.add(new Student(65,"punam"));
        stud.add(new Student(44,"kavya"));
        Collections.sort(stud);
        for(Student s:stud)
        {
            System.out.println(s);
        }
    }

}
