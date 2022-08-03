package august222.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        /*OrderedPair<String, Integer> orderedPair= new OrderedPair<>("key1", 5);
        //assign generic type to raw type
        OrderedPair rawOrderedPair = orderedPair;
        //assign back is possible since key, value instance of String, Integer respectively
        OrderedPair<String, Integer> orderedPair2 = rawOrderedPair;

        //assign a raw type into generic type
        OrderedPair rawOrderedPair2 = new OrderedPair("key2", 2);
        OrderedPair<String, Integer> orderedPair3 = rawOrderedPair2;
        System.out.println(orderedPair3.getKey());
//        OrderedPair orderedPair1 = new OrderedPair("Ali", "5"); //raw type
//        System.out.println(orderedPair1.getKey() instanceof String);*/
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Ali");

        // * assigning to raw type
        Box rawBox = stringBox; //ok
        rawBox.setObject(new Box());

        //System.out.println(rawBox.getObject());
        //System.out.println(rawBox.getObject() instanceof String);

        // * assigning generic type into raw type
        // * warning !!!
        // * because rawBox variables can be any type
        // * which is now assigned into String type variables
        // * may cannot cast
        Box<String> stringBox1 = rawBox; //unchecked conversion warning



    }
}

/*//interface Pair<K, V> {
//    K getKey();
//    V getValue();
//}
//class OrderedPair<K, V> implements Pair<K, V> {
//    private K key;
//    private V value;
//
//    public OrderedPair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//}
*/
class Box<T> {
    private T t;

    public T getObject() {
        return t;
    }

    public void setObject(T t) {
        this.t = t;
    }
}
