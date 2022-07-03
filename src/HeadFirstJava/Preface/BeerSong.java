package HeadFirstJava.Preface;

public class BeerSong {
    public static void main(String[] args) {
        int num = 99;
        while (num > 14) {
            if (num % 10 == 4 || num % 10 == 2 || num % 10 == 3) {
                System.out.println(num + " butylki piva na stene");
            } else if (num % 10 == 1) {
                System.out.println(num + " butylka piva na stene");
            } else System.out.println(num + " butylok piva na stene");
            num--;
        }

        while (num > 4) {
            System.out.println(num + " butylok piva na stene");
            num--;
        }

        for ( ;num > 0; num--) {
            if (num == 4 || num == 3 || num == 2) {
                System.out.println(num + " butylki piva na stene");
            } else {
                System.out.println(num + " butylka piva na stene");
            }
        }

        System.out.println("pivo zakonchilos");
    }
}