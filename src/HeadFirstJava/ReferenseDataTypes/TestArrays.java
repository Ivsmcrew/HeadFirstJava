package HeadFirstJava.ReferenseDataTypes;

public class TestArrays {
    public static void main(String[] args) {
        int[] index = new int[4];
        String[] islands = new String[4];

        islands[0] = "Bermuds";
        islands[1] = "Fydgy";
        islands[2] = "Azorsk";
        islands[3] = "Kozymel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
