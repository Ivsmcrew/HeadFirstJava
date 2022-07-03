package HeadFirstJava.MethodsAndObjects;

public class SumTest {
    public static void main(String[] args) {
        Sum newSum = new Sum();
        int var1, var2, rez;
        var1 = 3;
        var2 = 56;
        rez = newSum.takeTwo(var1, var2);

        System.out.println("Rezult equals " + rez);
    }
}
