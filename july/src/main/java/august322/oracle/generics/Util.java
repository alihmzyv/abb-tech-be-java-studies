package august322.oracle.generics;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("key1", 1);
        Pair<String, Integer> p2 = new Pair<>("key2", 2);

        Util.compare(p1, p2);
    }
}
