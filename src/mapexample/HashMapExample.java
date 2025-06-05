package mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(108, "Mango");
        map1.put(107, "Guava");
        map1.put(103, "Pineapple");
        map1.put(104, "Banana");
        map1.put(101, "Apple");
        map1.put(102, "Orange");
        map1.put(104,"Graps");//Banana is removed and it is overrideen by grapes
        map1.put(null, null);
        map1.put(null, "Cherry");// null is removed Cherry is overrided

        System.out.println("map1 is : "+map1);
        map1.remove(104);
        System.out.println("map1 after 104 key is removed: "+map1);

        // traversing
        System.out.println("map1 traversing ");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey() + "-----"+m1.getValue());
        }

    }
}
