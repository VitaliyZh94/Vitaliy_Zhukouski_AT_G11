package project.content;

public class Bubble {

    private double volume = 0.3;
    private String gas;

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Crump!");
    }
}
