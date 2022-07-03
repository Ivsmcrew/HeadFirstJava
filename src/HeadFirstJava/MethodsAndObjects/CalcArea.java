package HeadFirstJava.MethodsAndObjects;

public class CalcArea {
    public static void main(String[] args) {
        int a = calcArea(3, 2);
        short c = 7;
        calcArea(c, 15);

    }

    static int calcArea(int A, int B) {
        return A * B;
    }
}
