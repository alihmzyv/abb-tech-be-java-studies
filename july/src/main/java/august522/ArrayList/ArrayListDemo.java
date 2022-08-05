package august522.ArrayList;

import java.util.ArrayList;
import java.util.List;


//Exploring ArrayList implementations
public class ArrayListDemo {
    public static void main(String[] args) {

        //constructors
        // constructor 1
        List<Integer> list1 = new ArrayList<>(5);
        //if initial cap > 0: initializes array elementData with initial cap
        //if cap = 0 : elementData = {};
        // if cap < 0: throw new IllegalArgumentException("Illegal Capacity: "+
        //                                               initialCapacity)

        //constructor 2
        List<Integer> list2 = new ArrayList<>(); //empty contructor
        //elementData = {}


        //contructor 3
        //convert collection toArray a
        //sets size field to a.length
        //if size !=0 --> size > 0 (since a.length cannot be negative):
        //if collection.class == ArrayList.class (ArrayList<>
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        ArrayList<Number> list3 = new ArrayList<>(collection);
        System.out.println(list3);


        //method 1 - original
        //void trimToSize()
        //modCount++ //implies that it was modified
        //size shows the index the next element can be added
        //cannot get an element whose index >= size, throws out of bounds exception
        //but due to grow, elementData.length can be larger than size
        //if size < elementData.length:
        //elementData = {} if size == 0
        //elementData = copyOf(elementData, size), trimmed the size+ part


        //ensureCapacity(minCap) - method 2
        //grow only if minCap > elementData.length && !(size is default 10 and minCap < 10)

        //method 3 - size()
        //returns size

        //method 4 - isEmpty()
        //returns true if size == 0

        //method 5 - contains(Object o)
        // returns indexOf(o) >= 0 (indexOf is for to check through all the array elements)
        //returns indexOfRange(o, 0, size) //(Object 0, int start, int end)
        // Object[] es = elementData
        // if o is null, check for null, return first index of occurrence
        // else, check for the equality (if overriden, of course overriden will be called) of object through elementData till size,
        // if found return index
        // return -1


        //method 6 - lastIndexOf  - the same with indexOf - except start iteration from end == size - 1

        //method 7 - clone()
        //create shallow copy of ArrayList object
        //since elementData are not copied, both v.elementData and this.elementData --> the same array
        //v.elementData copies elementData, but till size
        //v.modCount = 0
        //return v


        //method 8 - toArray()
        //returns copy of elementData, till size

        //method 9 - toArray(T[] a)
        //returns an array containing all the elements of elementData
        //if a.length<size, return copy of elementData
        //else copy elements of elementData to a
        //if a.length > size, set a[size] to null as a marker
        //return a


        //method 10 - get(int index), elementData(int index)
        //checks whether index < size which is okay
        //returns elementData(index)
        //casts elementData[index] into generic type argument provided, and returns
        //if not generic used, object type is returned


        //method 11 - set(int index, E element)
        //check index
        //calls elementData(index) which casts elementData[index] into generic type argument provided, and returns
        //save it to oldValue
        //change elementData[index] = element
        //returns oldValue


        //method 12 - add(E e), add(E e, Object[] elementData, int s)
        //modCount++
        //calls add(e, elementData, size)
        //if s (size) == elementData.length, grow
        //elementData[s] = e;
        //size = s + 1 // size increment

        //method 13 - add(int index, E element)
        //checks, if index > size or negative, throws error
        //modCount++
        //final int s;
        //Object[] elementData
        // s = size, elementData = this.elementData
        //if s > elementData.length, grow
        //System.arraycopy(elementData, index,
        //                         elementData, index + 1,
        //                         s - index); //shifts one index to right each element
        //thus not recommended to use ArrayList, if frequent operation is add, remove from not end
        //elementData[index] = element; //refers to this.elementData
        //size = s + 1


        //method 14 - remove(int index), fastRemove(es, index)
        //check index
        //final Object[] es = elementData
        //E oldvalue = (E) es[index]
        //fastRemove(es, index)
        //fastRemove:
        //modCount++;
        //final int newSize = size - 1
        //shift one to left
        //size=newSize
        //es[size] = null;


        //method 15 - clear
        //modCount++
        //final Object[] es = elementData
        //to = size
        //i = size = 0 //size  = 0 already
        //from i to to, set all to null


        //method 16 - equals(Object o), equalsRange, equalsArrayList overrided Object, equals(Object obj)
        // if both refers to the same thing, return true
        //if o does not implement List, return false (can be another implementation of List, rather than Arraylist only)
        // final int expectedModCount = modCount;
        //1. if o is ArrayList, boolean equal = equalsArrayList((ArrayList<?>) o):
        //final int otherModCount = other.modCount;
        //final int s = size;
        //boolean equal
        //understood !

//        List<Integer> x = new ArrayList<>();
//        x.add(1);
//        x.add(2);
//        List<Number> y = new ArrayList<>();
//        y.add(1);
//        y.add(2);
//        System.out.println(x.equals(y));

        //method 17 - remove(Object obj) checked !

        //method 18 - boolean addAll(Collection c), (int index, Collection c) !!checked!!
        //Object[] a = c.toArray()
        //modCount++;
        //int numNew = a.length;
        //if numNew == 0, return false;
        //Object[] elementData;
        //final int s;
        //if numNew > the empty part of the elementData, grow
        //copy a to elementData, starting from s = size
        //size = s + numNew
        //return true;



    }
}
