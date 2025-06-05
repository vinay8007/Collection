package setexamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        Set<String> st1 = new TreeSet<String>();
        st1.add("Mango");
        st1.add("Orange");
        st1.add("Guava");
        st1.add("Guava");
        st1.add("Graps");

        System.out.println("st1 is: "+st1);

        st1.remove("Orange");
        System.out.println("st1 after removing: "+st1);

        //travering the stack
        System.out.println("st1 traverse");
        for(String s1 :st1){
            System.out.println(s1);
        }
    }
}
