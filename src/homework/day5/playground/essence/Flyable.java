package homework.day5.playground.essence;

public interface Flyable {

    String getName();

    default void fly(String direction) {
        System.out.printf( "I am %s, my name is %s and I amd flying to %s\n", this.getClass().getSimpleName(), this.getName(), direction);
    }
}
