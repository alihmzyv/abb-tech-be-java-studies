package august422;

import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
//        MyNode mn = new MyNode(5);
//        Node n = mn;
//        n.setData("Hello");
//        Integer x = mn.data;
//        System.out.println(x);
//        MyNode mn = new MyNode(5);
//        Node n = mn;            // A raw type - compiler throws an unchecked warning
//        // Note: This statement could instead be the following:
//        //     Node n = (Node)mn;
//        // However, the compiler doesn't generate a cast because
//        // it isn't required.
//        n.setData("Hello");     // Causes a ClassCastException to be thrown.
//        Integer x = (Integer) mn.data;
//        Collection<Integer> x = new ArrayList<>();
//        x.add(5);
//        System.out.println(x.toString());
//        Arrays.copyOf(new int[]{1}, 2, Object[].class)
    }
}

class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}