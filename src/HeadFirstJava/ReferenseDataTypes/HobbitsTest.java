package HeadFirstJava.ReferenseDataTypes;

public class HobbitsTest {
    public static void main(String[] args) {
        Hobbits[] person = new Hobbits[3];
        int i = 0;
        while(i < 3) {
            person[i] = new Hobbits();
            person[i].name = "Bilbo";
            if (i == 1)
                person[i].name = "Frodo";
            if (i == 2)
                person[i].name = "Sam";
            System.out.println(person[i].name + " - the name of hobbit");
            i++;
        }
    }
}
