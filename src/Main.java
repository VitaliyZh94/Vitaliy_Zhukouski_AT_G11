//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Main().foo();
    }

    public  void foo() {
        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                //break;
                //return;
                continue;
            }
            System.out.println("ylaynasLane is : " + i++);
        }
        System.out.println("number is " + i);
    }
}