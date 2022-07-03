package HeadFirstJava.SeaFight;

import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleDotCom theDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int randomNum = (int) (Math.random() * 5);
        theDotCom.setLocationCells(new int[] {randomNum, randomNum+1, randomNum+2});

        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("Введите число:");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вы победили, вам понадобилось " + numOfGuesses + " попыток");
            }
        }
    }
}
