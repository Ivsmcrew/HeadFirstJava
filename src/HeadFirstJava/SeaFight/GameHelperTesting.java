package HeadFirstJava.SeaFight;

import java.util.ArrayList;

public class GameHelperTesting {
    public static void main(String[] args) {
        //проверяем метод класса GameHelper "placeDotCom"
        System.out.println("Проверка метода placeDotCom");
        GameHelper helper1 = new GameHelper();
        ArrayList<String> newLocationTesting = null;
        for (int i = 0; i < 10; i++) {
            newLocationTesting = helper1.placeDotCom(3);
            System.out.print(newLocationTesting.get(0) + " " + newLocationTesting.get(1) + " " + newLocationTesting.get(2) + "\n");
        }

        //проверяем метод класса GameHelper
        System.out.println("Проверка метода getUserInput");
        GameHelper helper2 = new GameHelper();
        String inp = helper2.getUserInput("Сделай ход, проверим, раюотает ли метод))): ");
        System.out.println(inp);
    }
}
