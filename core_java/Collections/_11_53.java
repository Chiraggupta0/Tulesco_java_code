// instead of list of student we will have list of students

package core_java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

 
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }  

    
}
public class _11_53 {
    public static void main(String[] args) {
        
        List<Student> studs = new ArrayList<>();
        Comparator<Student> com= new Comparator<Student>() {
            public int compare(Student i , Student j)
            {
                if(i.age>j.age) return 1;
                else return -1;
            }
        };
        studs.add(new Student(21,"chirag"));
        studs.add(new Student(32,"shourya"));
        studs.add(new Student(54,"anuj"));
        studs.add(new Student(65,"punam"));
        studs.add(new Student(44,"kavya"));

        // Collections.sort(studs); --  this will not work when we create list of objects of student class

        Collections.sort(studs,com);
        for(Student s:studs)
            System.out.println(s);
    }
}
