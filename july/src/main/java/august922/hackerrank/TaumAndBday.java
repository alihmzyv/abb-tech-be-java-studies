package august922.hackerrank;

public class TaumAndBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long bcL = bc;
        long wcL = wc;

        if (bc + z < wc) {
            wcL = bc + z;
        }
        if (wc + z < bc) {
            bcL = wc + z;
        }

        return b * bcL + w * wcL;
    }
}
