public class DiningRoom extends Room {

    private String name;
    private int capacity;

    public DiningRoom(String name, double fee, int capacity) {
        super(name, fee, capacity);
        this.name = name;
        this.capacity = capacity;
    }
}
