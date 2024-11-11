package homework.day3.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(2));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(3));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('s'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(3.2F));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(3.2));
        trainMethodsIf.returnNewBoolean(1 > 2);
    }
}
