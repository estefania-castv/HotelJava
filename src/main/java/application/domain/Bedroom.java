package application.domain;

public class Bedroom {

    private int id;
    private String room;
    private String roomType;
    private double price;
    private boolean state;

    public Bedroom() {}

    public Bedroom(int id, String room, String roomType, double price, boolean state) {
        this.id = id;
        this.room = room;
        this.roomType = roomType;
        this.price = price;
        this.state = state;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}