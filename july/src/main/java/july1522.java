import java.util.Arrays;
import java.util.Objects;

public class july1522 {
    public static void main(String[] args) {
        String[] arr1 = {"1", "2"};
        String[] arr2 = {"1", "2"};
        System.out.println(Arrays.equals(arr1, arr2));
    }
}

class Class1 {
    int a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class1 class1 = (Class1) o;
        return a == class1.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
