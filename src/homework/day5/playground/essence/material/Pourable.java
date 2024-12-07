package homework.day5.playground.essence.material;

public interface Pourable {

    int mass();

    void sound();

    default void spread(String storeName) {
        System.out.printf( "I am %s and I am spreading in %s\n", this.getClass().getSimpleName(), storeName);
        sound();
    }
}
