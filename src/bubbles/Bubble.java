package bubbles;

public class Bubble {
    final double volume = 0.3;
    double gasComposition;

    public Bubble(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burst() {
        System.out.println("Cramp!");
    }


}
