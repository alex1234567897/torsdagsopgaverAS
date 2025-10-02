package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // --- Three Rooms ---
        Room room1 = new Room(1,5);
        Room room2 = new Room(100,1);
        Room room3 = new Room(6,7);

        // --- adding Rooms to list ---
        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        // --- instanrition of building ---
        Building myBuilding = new Building(roomList,3);

        // --- Count Of Lamps ---
        int totalLamps = countLampsInBuilding(myBuilding);
        System.out.println("Total of Lamps in the building is: "+totalLamps);

        // --- Count Of Windows ---
        int totalWindows = countWindowsInBuilding(myBuilding);
        System.out.println("Total of Windows in the building is: "+totalWindows);


        //--- test isNormal ---
        Building normalBuilding = new Building(roomList, 2);  // 3 rooms, 2 floors → normal
        Building abnormalBuilding = new Building(roomList, 5); // 3 rooms, 5 floors → abnormal

        System.out.println("Normal building? " + isNormal(normalBuilding));      // true
        System.out.println("Abnormal building? " + isNormal(abnormalBuilding));  // false


    }

    // --- Static for them Lamps ---
    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        // --- loop through all the rooms in the building ---
        for(Room room : building.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // --- Static for windows ---
    public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        // --- loop through all the rooms in the building ---
        for(Room room : building.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    // --- Static is Normal? ---
    public static boolean isNormal(Building building){
        int floors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();

        return floors <= numberOfRooms;
    }

}
