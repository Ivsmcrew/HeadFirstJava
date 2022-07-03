package HeadFirstJava.Preface;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte a, b; // 8bit
        short c, d; // 16bit
        int e, f; //32 bit
        long g, h; //64bit

        //Можно присвоить переменной short значение переменной byte
        a = 127;
        b = a;
        c = a;
        System.out.println(a + " " + b + " " + c);

        //Нельзя присвоить переменнйо short значение переменной int
        e = 1000;
        d = 1000;
        //d = e;
        System.out.println(e);
    }
}
