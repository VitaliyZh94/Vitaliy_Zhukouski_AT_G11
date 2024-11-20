package homework.day6;

import homework.day5.playground.essence.craft.air.AirCraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.craft.hand.Mug;
import project.boxing.Bottle;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassT1 = new GenericMethodsInGenericClassT<String>();
        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassT2 = new GenericMethodsInGenericClassT<Integer>();
        GenericMethodsInGenericClassT<Copter> genericMethodsInGenericClassT4 = new GenericMethodsInGenericClassT<Copter>();
        GenericMethodsInGenericClassT<Plane> genericMethodsInGenericClassT5 = new GenericMethodsInGenericClassT<Plane>();
        GenericMethodsInGenericClassT<Rocket> genericMethodsInGenericClassT6 = new GenericMethodsInGenericClassT<Rocket>();
        GenericMethodsInGenericClassT<Car> genericMethodsInGenericClassT7 = new GenericMethodsInGenericClassT<Car>();
        GenericMethodsInGenericClassT<Moped> genericMethodsInGenericClassT8 = new GenericMethodsInGenericClassT<Moped>();
        GenericMethodsInGenericClassT<Motorbike> genericMethodsInGenericClassT9 = new GenericMethodsInGenericClassT<Motorbike>();
        GenericMethodsInGenericClassT<Bottle> genericMethodsInGenericClassT11 = new GenericMethodsInGenericClassT<Bottle>();
        GenericMethodsInGenericClassT<Can> genericMethodsInGenericClassT12 = new GenericMethodsInGenericClassT<Can>();
        GenericMethodsInGenericClassT<Mug> genericMethodsInGenericClassT14 = new GenericMethodsInGenericClassT<Mug>();

        genericMethodsInGenericClassT1.genericMethodOneGenArg("sad");
        genericMethodsInGenericClassT2.genericMethodOneGenArg(1);
        genericMethodsInGenericClassT4.genericMethodOneGenArg(new Copter(3, "Reno"));
        genericMethodsInGenericClassT5.genericMethodOneGenArg(new Plane(3, "Reno"));
        genericMethodsInGenericClassT6.genericMethodOneGenArg(new Rocket(1, "Reno"));
        genericMethodsInGenericClassT7.genericMethodOneGenArg(new Car(2, "Reno"));
        genericMethodsInGenericClassT8.genericMethodOneGenArg(new Moped(4, "Aist"));
        genericMethodsInGenericClassT9.genericMethodOneGenArg(new Motorbike(5,"Harley"));
        genericMethodsInGenericClassT11.genericMethodOneGenArg(new Bottle(2));
        genericMethodsInGenericClassT12.genericMethodOneGenArg(new Can(2, "Can"));
        genericMethodsInGenericClassT14.genericMethodOneGenArg(new Mug(2, "Mug"));

        genericMethodsInGenericClassT1.genericMethodHalfGenArgs("da", "net");
        genericMethodsInGenericClassT2.genericMethodHalfGenArgs(1, "da");
        genericMethodsInGenericClassT4.genericMethodHalfGenArgs(new Copter(2,"copter"), "da");
        genericMethodsInGenericClassT5.genericMethodHalfGenArgs(new Plane(3, "palne"), "da");
        genericMethodsInGenericClassT6.genericMethodHalfGenArgs(new Rocket(1, "rocket"), "da");
        genericMethodsInGenericClassT7.genericMethodHalfGenArgs(new Car(2, "Reno"), "da");
        genericMethodsInGenericClassT8.genericMethodHalfGenArgs(new Moped(4, "Aist"), "da");
        genericMethodsInGenericClassT9.genericMethodHalfGenArgs(new Motorbike(5,"Harley"), "da");
        genericMethodsInGenericClassT11.genericMethodHalfGenArgs(new Bottle(2), "da");
        genericMethodsInGenericClassT12.genericMethodHalfGenArgs(new Can(2, "Can"), "da");
        genericMethodsInGenericClassT14.genericMethodHalfGenArgs(new Mug(2, "Mug"), "da");

        System.out.println(genericMethodsInGenericClassT1.genericMethodTwoGenArgs("da", "net"));
        System.out.println(genericMethodsInGenericClassT2.genericMethodTwoGenArgs(1, 2));
        System.out.println(genericMethodsInGenericClassT4.genericMethodTwoGenArgs(new Copter(3, "copter"), new Copter(3, "copter")));
        System.out.println(genericMethodsInGenericClassT5.genericMethodTwoGenArgs(new Plane(3, "plane"), new Plane(3, "plane")));
        System.out.println(genericMethodsInGenericClassT6.genericMethodTwoGenArgs(new Rocket(1, "rocket"), new Rocket(1, "rocket")));
        System.out.println(genericMethodsInGenericClassT7.genericMethodTwoGenArgs(new Car(2, "Reno"), new Car(2, "Reno")));
        System.out.println(genericMethodsInGenericClassT8.genericMethodTwoGenArgs(new Moped(4, "Aist"), new Moped(4, "Aist")));
        System.out.println(genericMethodsInGenericClassT9.genericMethodTwoGenArgs(new Motorbike(5,"Harley"), new Motorbike(5,"Harley")));
        System.out.println(genericMethodsInGenericClassT11.genericMethodTwoGenArgs(new Bottle(2), new Bottle(2)));
        System.out.println(genericMethodsInGenericClassT12.genericMethodTwoGenArgs(new Can(2, "Can"), new Can(2, "Can")));
        System.out.println(genericMethodsInGenericClassT14.genericMethodTwoGenArgs(new Mug(2, "Mug"), new Mug(2, "Mug")));
    }
}
