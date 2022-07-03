package HeadFirstJava.MethodsAndObjects;

public class ChangingValues {
    public static void main(String[] args) {
        int x = 9;
        System.out.println("we show you x: " + x);
        go(x);
        System.out.println("we show you x: " + x);

    }

    static void go(int z) {
        z++;
        System.out.println("we show you z: " + z);
    }
}
