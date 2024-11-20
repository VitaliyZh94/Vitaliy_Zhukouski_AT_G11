package homework.day3.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println(mouse.getName() + System.lineSeparator() + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println(souce.getName() + System.lineSeparator() + souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee.getGender() + System.lineSeparator() + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.getDescription() + System.lineSeparator() + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade() + System.lineSeparator() + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
