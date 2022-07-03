package HeadFirstJava.GuessGame;

public class GuessGame {
    public void startGame() {
        //Объявление 3х экземпляров класса Player
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        //Объявление всех полей
        boolean isContinue = true;

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I imagined a number for guessing...");
        System.out.println("A number for guessing is " + targetNumber);

        //Тело основного метода
        while (isContinue) {
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("First gamer: " + guessp1);
            guessp2 = p2.number;
            System.out.println("Second gamer: " + guessp2);
            guessp3 = p3.number;
            System.out.println("Third gamer: " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                isContinue = false;
                System.out.println("We have a winner!!!!");
            } else {
                System.out.println("We have to continue!");
            }
        }
    }
}
