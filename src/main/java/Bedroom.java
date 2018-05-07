import Rooms.BedroomType;

public class Bedroom extends Room {

    BedroomType bedroomType;

    private String name;
    private double fee;

    public Bedroom(String name, double fee, BedroomType bedroomType ){
        super(name, fee, bedroomType.getCapacity());
        this.bedroomType = bedroomType;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

}
