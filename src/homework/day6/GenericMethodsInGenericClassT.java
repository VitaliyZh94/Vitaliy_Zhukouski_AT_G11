package homework.day6;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T t) {
        System.out.printf("I am an object of %s class\n", t.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T t1, T t2) {
        return "We are objects of " + t1.getClass().getSimpleName() + " class and " + t2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T t, String string) {

        int chars = string.length();

        System.out.printf("I got an object of %s class and string with %d characters\n", t.getClass().getSimpleName(), chars);
    }
}
