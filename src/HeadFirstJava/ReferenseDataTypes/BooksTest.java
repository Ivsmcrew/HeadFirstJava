package HeadFirstJava.ReferenseDataTypes;

public class BooksTest {
    public static void main(String[] args) {
        int x = 0;
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "HeadFirstJava";
        myBooks[1].title = "Hobbit";
        myBooks[2].title = "MyPony";

        myBooks[0].author = "Loshara";
        myBooks[1].author = "Bilbo";
        myBooks[2].author = "Igogo";

        while (x < 3) {
            System.out.println("The book " + myBooks[x].title + ", author " + myBooks[x].author);
            x++;
        }
    }
}
