package Rooms;

public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    FAMILY(4),
    SUITE(5);

    private int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
