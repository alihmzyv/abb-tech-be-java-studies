package august722.Map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> integerMap = new HashMap();
        integerMap.put("Ali", 10);
        integerMap.put("Kanan", 20);
        integerMap.put("Vali", 15);
        Map integerMap2 = new LinkedHashMap();
        integerMap2.put("Ali", 10);
        integerMap2.put("Kanan", 15);
        integerMap2.put("lala", 1);
        integerMap2.putAll(integerMap);
        Set<Map.Entry<String, Integer>> entries = integerMap2.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("Kanan")) {
                entry.setValue(200);
            }
        }

        System.out.println(integerMap2);

        Map x = new Hashtable();



//        Set<String> stringList = new HashSet<>();
//        Iterator<String> stringIterator = stringList.iterator();
//        while (stringIterator.hasNext()) {
//            System.out.println(stringIterator.next());
//        }
    }
}

