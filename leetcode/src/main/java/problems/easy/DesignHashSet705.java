package problems.easy;

import java.util.LinkedList;
import java.util.List;

public class DesignHashSet705 {
}

class MyHashSet {

    private List<Integer> hashSet;

    public MyHashSet() {
        hashSet = new LinkedList<>(); //linked list used, since it is faster than arraylist when it comes to removal operation
    }

    public void add(int key) {
        if (!hashSet.contains(key)) {
            hashSet.add(key);
        }
    }

    public void remove(int key) {
        hashSet.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return hashSet.contains(key);
    }
}
