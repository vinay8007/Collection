package listexamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<String> st1 = new Stack<String>();
        st1.push("Mango");
        st1.push("Apple");
        st1.push("Guava");
        st1.push("Orange");
        st1.push(null);
        st1.push("Guava");

        System.out.println("st1 is : "+st1);

        //remove the last 2 element from the stack
        st1.pop();
        st1.pop();
        System.out.println("after 2 pops: "+st1);

        // traverse the stack
        System.out.println("Traversing st1");
        for(String s1 : st1){
            System.out.println(s1);
        }
    }
}
