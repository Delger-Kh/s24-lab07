package frogger;

public class Frogger {
    private final Road road;
    private int position;
    private final Records records;
    private final FroggerID id;
    private final PlayerProfile profile;

    public Frogger(Road road, int position, Records records, FroggerID id, PlayerProfile profile) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.id = id;
        this.profile = profile;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself() {
        return records.addRecord(id, profile);
    }
}