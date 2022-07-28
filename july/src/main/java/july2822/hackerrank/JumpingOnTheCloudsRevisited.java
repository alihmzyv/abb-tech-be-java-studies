package july2822.hackerrank;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {

        //take inputs
        Scanner in = new Scanner(System.in);
        String[] nAndk = in.nextLine().split(" ");
        int n = Integer.parseInt(nAndk[0]);
        int k = Integer.parseInt(nAndk[1]);
        int[] arrOfClouds = convertStrArrtoIntArr(in.nextLine().split(" ")); //get array of clouds
        in.close();


        int energy = 100;

        int pos = 0;

        do {
            pos += k;

            if (pos >= n) {
                pos %= n;
            }

            //energy decrement
            energy--; //for each k step move
            //if thunderhead countered
            if (arrOfClouds[pos] == 1) {
                energy -= 2;
            }


        } while(pos != 0);

        System.out.println(energy);
    }

    public static int[] convertStrArrtoIntArr(String[] arrStr) {
        //converts String array into int array
        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }
}
