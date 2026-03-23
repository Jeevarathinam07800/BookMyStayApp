/**
 * ==========================================================
 * MAIN CLASS - UseCase4RoomSearch
 * ==========================================================
 *
 * Demonstrates searching available rooms.
 *
 * @version 4.0
 */

public class BookMyStayApp{

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomSearchService searchService = new RoomSearchService();

        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}