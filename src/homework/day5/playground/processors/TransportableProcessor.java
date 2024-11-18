package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int diff = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %d points\n", transportable.getClass().getSimpleName(), diff);
    }

    public void runTransportable(Transportable transportable) {
        int diff = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.printf("Transportable %s was moved to %d points\n", this.getClass().getSimpleName(), diff);
    }
}
