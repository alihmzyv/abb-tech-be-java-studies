package july2622.hackerrank;

import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfQueries = in.nextInt();
        in.nextLine();

        for (int i = 0; i < numOfQueries; i++) {
            Integer[] positions = convertStrArrtintArr(in.nextLine().split(" "));
            int catA = positions[0];
            int catB = positions[1];
            int mouseC = positions[2];

            if (Math.abs(catA - mouseC) < Math.abs(catB - mouseC)) {
                System.out.println("Cat A");
            }
            else if(Math.abs(catA - mouseC) > Math.abs(catB - mouseC)) {
                System.out.println("Cat B");
            }
            else {
                System.out.println("Mouse C");
            }
        }

        in.close();

    }

    public static Integer[] convertStrArrtintArr(String[] arrStr) {
        Integer[] arr = new Integer[arrStr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        return arr;
    }
}
