package homework.day10;

public class Mouse {

    private String pattern = "Mouse ";
    private String name = "Mouse ";
    int number;

    public Mouse(int number) {
        this.name += number;
        this.number = number;
    }

    public void peep() {
        System.out.println("Mouse " + number + " PEEP!");
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
