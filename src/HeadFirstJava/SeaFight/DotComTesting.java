package HeadFirstJava.SeaFight;

import java.util.ArrayList;

public class DotComTesting {
    public static void main(String[] args) {
        DotCom test = new DotCom();
        ArrayList<String> list = new ArrayList<String>();
        list.add("a3");
        list.add("b3");
        list.add("c3");
        test.setLocationCells(list);
        //Проверка метода "checkYourself" класса DotCom
        System.out.println(list.get(1));
        System.out.println(test.checkYourself("b3"));
        System.out.println(list.get(1));
    }
}
