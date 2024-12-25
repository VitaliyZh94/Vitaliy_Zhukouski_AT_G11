package homework.day5.playground.essence.creatures;

public interface Crawlable {

    String getName();
    String getSound();

    default void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s %s units\n", this.getClass().getSimpleName(), getName(), direction, distance, getSound());
    }

}
