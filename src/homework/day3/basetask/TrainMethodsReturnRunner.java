package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(2));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(5));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('A'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(2.3F));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(3.3));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short)5));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte)2));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));

    }
}
