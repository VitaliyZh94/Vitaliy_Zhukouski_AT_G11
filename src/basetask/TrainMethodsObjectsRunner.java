package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse(new Mouse("Micky", 2));
        System.out.println();
        trainMethodsObjects.processSouce(new Souce("Mazik", "White"));
        System.out.println();
        trainMethodsObjects.processBee(new Bee("Male", 5));
        System.out.println();
        trainMethodsObjects.processObstacle(new Obstacle("wall", "serious"));
        System.out.println();
        trainMethodsObjects.processPineapple(new Pineapple("tasty", 233));
    }
}
