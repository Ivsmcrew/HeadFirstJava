package HeadFirstJava.Preface;

public class WaterPool {
    public static void main(String[] args) {
        int x = 0;
        while (x < 3) {

            if (x < 1) {
                System.out.print("a ");
            }

            if(x < 1) {
                System.out.print("noise");
            }

            if (x == 1) {
                System.out.print("annoys");
            }

            if (x > 1) {
                System.out.print("an");
                System.out.print(" oyster");
            }
            System.out.println("");
            x++;
        }
    }
}
