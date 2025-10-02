package Task_3;


import java.util.List;

public class Building {

    private List<Room> rooms;
    private int numberOfFloors;

    //--- Constructor ---
    public Building(List<Room> rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // --- Getter and Setter of rooms ---
    public List<Room> getRooms() {
        return rooms;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    // --- Getter and Setter of Nummber of floors ---
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

}
