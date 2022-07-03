package HeadFirstJava.MethodsAndObjects;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size > 0)
            this.size = size;
        else
            System.out.println("Enter consistent variable");
    }

    void bark() {
        if (size > 70)
            System.out.println("AVGAVGAV");
        else if (size > 30)
            System.out.println("woofwoof");
        else if (size > 0)
            System.out.println("tyaf");
        else
            System.out.println("Something went wrong");
    }
}
