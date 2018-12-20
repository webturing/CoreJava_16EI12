package lec12interface.p4;

interface CanDrive {
    void drive();
}

interface CanDrift {
    void drift();
}

interface CanDriveAndCanDrift extends CanDrive, CanDrift {

}

class Weapon {

}

class Tank extends Weapon implements CanDriveAndCanDrift {

    @Override
    public void drift() {
        // TODO Auto-generated method stub

    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub

    }

}

class Car implements CanDrive {

    @Override
    public void drive() {
        // TODO Auto-generated method stub

    }

}

class Boat implements CanDrift {

    @Override
    public void drift() {
        // TODO Auto-generated method stub

    }
}

public class InterfaceApp1 {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Tank tank = new Tank();
        CanDrive[] drives = {car, tank};
        CanDrift[] drifts = {boat, tank};
    }
}
