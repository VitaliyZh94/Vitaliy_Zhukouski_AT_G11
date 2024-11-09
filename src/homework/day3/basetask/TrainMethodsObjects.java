package basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println(mouse.name + System.lineSeparator() + mouse.age);
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println(souce.name + System.lineSeparator() + souce.color);
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee.gender + System.lineSeparator() + bee.weight);
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.description + System.lineSeparator() + obstacle.severity);
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.grade + System.lineSeparator() + pineapple.heatCapacity);
        pineapple.printPineappleDetails();
    }
}
