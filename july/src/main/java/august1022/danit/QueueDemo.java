package august1022.danit;

import com.sun.source.tree.Tree;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        Queue<String> stringQueue = new PriorityQueue<>(comparator);
//        stringQueue.addAll(Arrays.asList("Ali", "Konul", "Babak", "Cafar"));
////        while(!stringQueue.isEmpty()) {
////            System.out.println(stringQueue.poll());
////        }
//        stringQueue.remove();
//        Deque<String> stringDeque = new ArrayDeque<>();
//        TreeSet<String> x = new TreeSet<>();
//        PriorityQueue<String> y = new PriorityQueue<>();
//        y.iterator()
//        String[] strings = {"x", "y", "Z"};
//        //1
//        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
//        stringList.add("a");
//        System.out.println(strings);
//        for (String each : strings) {
//            System.out.println(each);
//        }
//        LinkedHashMap
//        Map<Word, String> stringMap = new HashMap<>();
//        Word word = new Word("dog");
//        Word word1 = new Word("dog");
//        stringMap.put(word, "an animal");
//        stringMap.put(word1, "dsffsd");
//        System.out.println(stringMap.get(word));
//        stringMap.remove(word);
//        System.out.println(stringMap);
//        TreeSet;
//        LinkedHashMap
//        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
//        map.put(1, null);
//        map.put(2, null);
//        map.put(3, null);
//        map.put(4, null);
//        map.put(5, null);
//
//        Set<Integer> keys = map.keySet();
//        Integer[] arr1 = new Integer[]{1, 2, 3, 5};
//        Integer[] arr = keys.toArray(arr1);
//
//        System.out.println(Arrays.toString(arr1));
        LinkedHashMap<Integer, String> map
                = new LinkedHashMap<>(16, .75f, true);
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);
        System.out.println(map.get(3));

        Set<Integer> test1 = new HashSet<>();
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }
    }
}

class Word {
    private String name;

    public Word(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(name, word.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format("Word: %s", name);
    }

//    private static double volume(String solidom, double alturam, double areaBasem, double raiom) {
//        double vol;
//
//        if (solidom.equalsIgnoreCase("esfera")) {
//            vol=(4.0/3)*Math.pi*Math.pow(raiom,3);
//        }
//        else {
//            if (solidom.equalsIgnoreCase("cilindro")) {
//                vol=Math.pi*Math.pow(raiom,2)*alturam;
//            }
//        else {
//                vol=(1.0/3)*Math.pi*Math.pow(raiom,2)*alturam;
//            }
//        }
//        return vol;
//    }
}
