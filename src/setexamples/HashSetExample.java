package setexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> st1 = new HashSet<String>();
        st1.add("Mango");
        st1.add("Orange");
        st1.add("Guava");
        st1.add(null);
        st1.add("Guava");
        st1.add("Graps");
        st1.add(null);

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
