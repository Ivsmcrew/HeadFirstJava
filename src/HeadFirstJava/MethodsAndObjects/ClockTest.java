package HeadFirstJava.MethodsAndObjects;

public class ClockTest {
    public static void main(String[] args) {
        Clock tutu = new Clock();
        tutu.setTime("four");
        System.out.println(tutu.getTime());
    }
}
