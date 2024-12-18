package homework.day6;

import homework.day3.basetask.Bee;

public class GenericMethodsInGenericClassTwoParams<T, D> {

    public String genericMethodGenArgs(T t) {
        int genericsAmount = this.getClass().getTypeParameters().length;

        return "I received " + genericsAmount + " arguments of type: " + t.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(T t, D d) {
        int genericsAmount = this.getClass().getTypeParameters().length;

        return "I received " + genericsAmount + " arguments of type: " + t.getClass().getSimpleName() + " class, " + t.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(Bee t, String string) {
        System.out.printf("I got an object of %s class and string with %d characters\n", t.getClass().getSimpleName(), string.length());
    }

    public void genericMethodHalfGenArgs(T t, D d, String string) {
        System.out.printf("I got an object of %s class and %s class and string with %d characters\n", t.getClass().getSimpleName(), d.getClass().getSimpleName(), string.length());
    }

    public void genericMethodHalfGenArgs(D d, String string) {
        System.out.printf("I got an object of %s class and string with %d characters\n", d.getClass().getSimpleName(), string.length());
    }

}
