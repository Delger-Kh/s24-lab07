package frogger;

public class Main {
    public static void main(String[] args) {
        Road road = new Road(new boolean[]{false, false, true, false});
        PlayerProfile player = new PlayerProfile("John", "Doe", "123456789", "10001", "NY", "Male");
        Records records = new Records();
        FroggerID id = new FroggerID("FROG001");
        Frogger frogger = new Frogger(road, 0, records, id, player);
    }
}