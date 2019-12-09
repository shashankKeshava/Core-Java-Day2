package Lab08;

public class Door {
    Alarm alarm;

    Door(Alarm alarm) {
        this.alarm = alarm;
    }

    void openDoor() {
        System.out.println("Door opened");
        alarm.activate();
    }

    void closeDoor() {
        System.out.println("Door closed");
        alarm.deactivate();
    }
}
