package august622.set;

import java.util.*;

public class SortedSetString {
    public static void main(String[] args) {
        List stringList = Arrays.asList(new StringBuffer("AC"), new StringBuffer("ABC"), new String("x"), "x", new StringBuffer("AD"));
        TreeSet stringTreeSet = new TreeSet(new MyComparatorStringvsSB());
        stringTreeSet.addAll(stringList);
        System.out.println(stringTreeSet);
    }



    static class MyComparatorString implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1); //reverse of alphabetical order
        }
    }

    static class MyComparatorStringBuffer implements Comparator<StringBuffer> {
        @Override
        public int compare(StringBuffer o1, StringBuffer o2) {
            return o1.compareTo(o2);
        }
    }

    static class MyComparatorStringvsSB implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
//            String o1Str = o1.toString();
//            String o2Str = o2.toString();
//
//            int result = o1Str.length() - o2Str.length();
//            if (result == 0) {
//                result = o1Str.compareTo(o2Str);
//            }
//
//            return result;

            //add the dublicates as well
            String o1Str = o1.toString();
            String o2Str = o2.toString();

            int result = o1Str.length() - o2Str.length();
            if (result == 0) { //same length
                result = o1Str.compareTo(o2Str); //acording to alphabetical order then
            }

            if (result == 0) { //equal Strings
                result = 1; //add next to the dublicates of it
            }


            return result;
        }
    }
}
