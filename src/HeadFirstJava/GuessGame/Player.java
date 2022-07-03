package HeadFirstJava.GuessGame;

public class Player {
    public int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I think it is the number " + number);
    }
}
