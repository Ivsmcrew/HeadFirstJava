package HeadFirstJava.MethodsAndObjects;

public class Dog {
    int size;
    String name;

    public void bark(int countOfBarks) {
        int i = 0;
        while (i < countOfBarks) {
            if (size > 70)
                System.out.println("AVGAVGAV");
            else if (size > 30)
                System.out.println("woofwoof");
            else
                System.out.println("tyaf");
            i++;
        }
    }
}
