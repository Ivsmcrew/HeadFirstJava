package HeadFirstJava.MethodsAndObjects;

public class GoodDogTest {
    public static void main(String[] args) {
        GoodDog[] myPets = new GoodDog[7];
        myPets[0] = new GoodDog();
        myPets[1] = new GoodDog();

        myPets[0].setSize(-10);
        System.out.println(myPets[0].getSize());

        myPets[1].setSize(30);
        System.out.println(myPets[1].getSize());

        myPets[0].bark();
        myPets[1].bark();
    }
}
