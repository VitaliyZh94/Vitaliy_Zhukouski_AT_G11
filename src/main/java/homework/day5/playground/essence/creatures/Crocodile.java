package homework.day5.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable{

    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getSound() {
        return "wr-wr-wrr-r..";
    }
}
