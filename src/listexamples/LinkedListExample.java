package listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args){
        //declearing the Linkedlist
        List<Integer> list1 =new LinkedList<Integer>();
        //adding element
        list1.add(12);
        list1.add(33);
        list1.add(10);
        list1.add(55);
        list1.add(33);
        list1.add(33);
        list1.add(27);
        //list1.add(null);
        list1.add(67);
        //list1.add(null);
        list1.add(-12);
        list1.add(-33);

        System.out.println("list1 is : "+list1);

        //remove element
        list1.remove(2);
        System.out.println("after removing 2nd index element list is: "+list1);
        // search element
        System.out.println("4th index element is: "+list1.get(4));
        System.out.println("5th index element is: "+list1.get(5));
        // size of the list
        System.out.println("list1 size is: "+list1.size());

        //sorting the list
        Collections.sort(list1);
        System.out.println("list1 after sorting is : "+list1);

        //traverse the list1
        System.out.println(" list1 traversal");
        for(Integer l1 : list1) {
            System.out.println(l1);

        }
    }
}
