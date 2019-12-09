package Lab08;

public class Lab08 {
    public static void main(String[] args) {

        Door a1 = new Door(new SoundAlarm());
        a1.openDoor();

        Door a2 = new Door(new VisualAlarm());
        a2.openDoor();
        a2.closeDoor();
    }
}
