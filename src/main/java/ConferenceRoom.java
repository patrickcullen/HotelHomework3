public class ConferenceRoom extends Room {

    private String name;
    private double fee;
    private int capacity;

    public ConferenceRoom(String name, double fee, int capacity) {
        super(name, fee, capacity);
        this.name = name;
        this.fee = fee;
        this.capacity = capacity;
    }
}
