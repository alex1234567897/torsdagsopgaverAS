package Task_3;

public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // --- Getter and setter of number of lamps ---
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }

    // --- getter and setter of number of windows ---
    public int getNumberOfWindows(){
        return numberOfWindows;
    }
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

}
