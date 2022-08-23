package august2322;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsCompleteReferenceDemo {
    public static void main(String[] args) {
        //toArray
        List<Integer> list = Arrays.asList(1, 2, 3);
        Integer[] arr = new Integer[]{0, 0, 0, 5, 6};
        list.toArray(arr);//fits in the arr
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = list.toArray(new Integer[0]); //does not fit
        System.out.println(Arrays.toString(arr2)); //1, 2, 3
        Integer[] arr3 = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr3));
    }
}
