import java.util.ArrayList;

public abstract class Room {


    String name;
    double fee;
    int capacity;
    ArrayList<Guest> guests;

    public Room(String name, double fee, int capacity) {
        this.name = name;
        this.fee = fee;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if (getGuestCount() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

//    public String returnArray(){
//        if (getGuestCount() > 0) {
//            return this.guests.subList(0, this.guests.size());
//        }
//    }


}
