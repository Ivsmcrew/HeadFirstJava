package HeadFirstJava.ReferenseDataTypes;

public class ReferenceDataTypesTest {
    public static void main(String[] args) {
        ReferenceDataTypes[] newVariable = new ReferenceDataTypes[6];
        newVariable[0] = new ReferenceDataTypes();
        newVariable[0].Hello();
        newVariable[0].Amount(5);

        int[] numbers = new int[3];
        numbers[0] = 13;
        numbers[1] = 24;
        numbers[2] = 35;

        String[] literals = new String[3];
        literals[0] = new String("one");
        literals[1] = "two";
        literals[2] = "three";

        boolean[] sense = new boolean[3];
        sense[0] = true;
        sense[1] = true;
        sense[2] = false;
    }
}
