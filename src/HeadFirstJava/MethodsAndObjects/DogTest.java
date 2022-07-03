package HeadFirstJava.MethodsAndObjects;

public class DogTest {
    public static void main(String[] args) {
        Dog sharik = new Dog();
        sharik.size = 80;
        sharik.bark(6);

        Dog bobik = new Dog();
        bobik.size = 20;
        bobik.bark(4);
    }
}
