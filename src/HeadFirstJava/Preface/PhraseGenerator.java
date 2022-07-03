package HeadFirstJava.Preface;

public class PhraseGenerator {
    public static void main(String[] args) {
        String[] text1 = {"mother", "father", "grandmother", "grandfather", "uncle", "nephew"};
        String[] text2 = {"amazing", "awful", "smart", "stupid", "fancy", "pretty"};
        String[] text3 = {"always", "never", "sometimes"};

        int rangeOfText1 = text1.length;
        int rangeOfText2 = text2.length;
        int rangeOfText3 = text3.length;

        int numOfWord1 = (int) (Math.random()*rangeOfText1);
        int numOfWord2 = (int) (Math.random()*rangeOfText2);
        int numOfWord3 = (int) (Math.random()*rangeOfText3);

        String phrase = text1[numOfWord1] + " " + text2[numOfWord2] + " " + text3[numOfWord3];
        System.out.println(phrase);
    }
}
