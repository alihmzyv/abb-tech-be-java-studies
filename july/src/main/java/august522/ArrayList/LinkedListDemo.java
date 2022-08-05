package august522.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        /*
        private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
         ***Constructors
         * 1. public LinkedList()
         * size = 0;
         * first = null;
         * last  = null;
         *
         * 1. public LinkedList(Collection<? extends E> c)
         * this()
         * addAll(c)
         *
         ***methods
         * 1. addAll(Collection<? extends E> c)
         * returns addAll(size, c);
         *
         * 2. addAll(int index, Collection<? extends E> c)
         * checked if index = size, last null, succ = null;

         3. getFirst(), getLast() gives the E type object of first or last Node respectively, if list is empty, throws NoSuchElementError

        4.  removeFirst(), removeLast() calls unlinkFirst(f), unlinkLast(l)

       4.1. unlinkFirst(f), unlinkLast(l) unlink the respective node, returns the element of it

       5. addFirst(E e), addLast(E e) calls linkFirst(e), linkLast(e) respectively
       5.1 linkFirst(e), linkLast(e) links the node to the head or tail respectively

        6. contains(Object o) returns indexOf(o) >= 0;
        6.1  indexOf(Object o) returns the first index of o, if not found, -1


        7. add(E e) calls linkLast(e)


        8.remove (Object o)
        iterates through the nodes, if finds equality, calls unlink(node)
        if works, return true;
        if not found, returns false

        8.1. unlink(Node<E> x) sets element, next, prev of x to null, unlinks, returns element of x

        9. addAll(Collection<? extends E> c) adds all the elements of c to the end of list

        9.1 addAll(int index, Collection<? extends E> c ) adds all the elements of c to the end of list, starting from index

        10. clear() - actually setting first, last to null, size to 0, would be enough.
        But for GC, this removes references to nodes, which make them ready to be garbage collected


        11. get(int index) returns node(index).item;
        11.1 node(index) returns the node located at index

        12. set(int index, E element) - sets the E item of node located at index to element, returns old item

        13. add(int index, E element) - if index == size, linkLast(element) else:
        calls linkBefore(element, node(index))
        13.1 linkBefore(element, node(index)) creates new node, sets prev of it to node(index).prev, sets node(index).prev to new node
        sets element to new node.item

        14. remove(int index) - returns unlink(node(index));

        15. indexOf(Object o) returns the index of node whose item.equals(o)

        16. lastIndex(object o) - iterates from the last index to first



        17. peek() - the same with getFirst(), in contrary to getFirst(), returns null if first == null

        18.
         */

    }
}
