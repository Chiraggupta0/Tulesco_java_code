// map 
//  map is a collection of key and values
// key are unique
// so key are actually sets
package core_java.Collections;

import java.util.*;

public class _11_35 {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        // if we wabt to use synchronised version we use hashTable otherwise we use hashmap
        //  if we use multiple thread then we use hashTables

        //  Map<String,Integer> student = new Hashtable<>();
        students.put("chirag",54);
        students.put("kavya",55);
        students.put("anuj",76 ); 
        students.put("punam",88);
        students.put("shourya",92);

        System.out.println(students);
        // above will not give answer in sorted manner nor it will give answer in the way they are inserted
        // it will give answer in random way
        System.out.println(students.get("chirag")); //  to get any particular keys value

        // to print all the keys
        System.out.println(students.keySet());

        //  for printing each key and value line by line

        for(String key: students.keySet())
        {
            System.out.println(key +" : "+ students.get(key));
        }
        
         
    }
    


}
