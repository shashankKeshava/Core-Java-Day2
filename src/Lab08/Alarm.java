package Lab08;

public class Alarm {
    String alarmType;

//    Door door = new Door(10, 20);

//    public float getDoor() {
//        return door.length * door.breath;
//    }

    Alarm(String alarmType) {
        this.alarmType = alarmType;
    }

    void activate() {
        System.out.println(this.alarmType + ": Alarm Activated");
    }

    void deactivate() {
        System.out.println(this.alarmType + ": Alarm De-Activated");

    }

}
