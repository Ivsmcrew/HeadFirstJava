package HeadFirstJava.ReferenseDataTypes;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.name = "Lerochka";

        //создадим массив
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Spike";
        myDogs[1].name = "Sharik";

        System.out.println("Name of the last dog " + myDogs[2].name);

        int i = 0;
        while (i < myDogs.length) {
            myDogs[i].bark();
            i++;
        }
    }
}
