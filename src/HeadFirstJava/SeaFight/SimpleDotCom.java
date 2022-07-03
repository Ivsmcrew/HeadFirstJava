package HeadFirstJava.SeaFight;

public class SimpleDotCom {
    private int numOfHits;
    private int[] locationCells;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);

        String result = "Мимо";

        for (int cell : locationCells) {
            if (cell == guess) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }

        System.out.println(result);
        return result;
    }
}
