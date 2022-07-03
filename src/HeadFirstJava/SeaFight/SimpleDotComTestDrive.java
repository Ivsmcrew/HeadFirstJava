package HeadFirstJava.SeaFight;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4}; //placing of a website
        dot.setLocationCells(locations);

        String userGuess = "2";      //the choice of a player
        String result = dot.checkYourself(userGuess);

        String testResult = "Неудача";
        if (result.equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
