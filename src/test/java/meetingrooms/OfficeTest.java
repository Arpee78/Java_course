package meetingrooms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {

    Office office = new Office();

    @BeforeEach
    void initOffice(){
        office.addMeetingRoom("Big Room", 10, 20);
        office.addMeetingRoom("Medium Room", 7, 15);
        office.addMeetingRoom("Smaller Room", 5, 10);
        office.addMeetingRoom("Smallest Room", 3, 7);
    }

    @Test
    void testAddMeetingRoom() {
        int roomCount = office.getMeetingRooms().size();
        office.addMeetingRoom("Big Room", 10, 20);
        assertEquals(roomCount+1, office.getMeetingRooms().size());
        assertEquals("Big Room", office.getMeetingRooms().get(0).getName());
    }

    @Test
    void testGetMeetingRoomsInReverseOrder() {
        List<MeetingRoom> reverse = office.getMeetingRoomsInReverseOrder();
        assertEquals(reverse.get(0), office.getMeetingRooms().get(3));
        assertEquals(reverse.get(1), office.getMeetingRooms().get(2));
        assertEquals(reverse.get(3), office.getMeetingRooms().get(0));
    }

    @Test
    void testGetEverySecondMeetingRoomOdds() {
        List<MeetingRoom> everySecond = office.getEverySecondMeetingRoom(1);
        assertEquals(everySecond.get(0), office.getMeetingRooms().get(0));
        assertEquals(everySecond.get(1), office.getMeetingRooms().get(2));
    }

    @Test
    void testGetEverySecondMeetingRoomEvens() {
        List<MeetingRoom> everySecond = office.getEverySecondMeetingRoom(2);
        assertEquals(everySecond.get(0), office.getMeetingRooms().get(1));
        assertEquals(everySecond.get(1), office.getMeetingRooms().get(3));
    }

    @Test
    void testGetMeetingRoomWithGivenName() {
        MeetingRoom meetingRoom = office.getMeetingRoomWithGivenName("Big Room");
        assertEquals("Big Room", meetingRoom.getName());
    }

    @Test
    void testGetMeetingRoomWithGivenNameMissing() {
        MeetingRoom meetingRoom = office.getMeetingRoomWithGivenName("Big Roooom");
        assertEquals(null, meetingRoom);
    }

    @Test
    void testGetMeetingRoomsWithGivenNamePart() {
        List<MeetingRoom> result = office.getMeetingRoomsWithGivenNamePart("Big");
        assertEquals("Big Room", result.get(0).getName());
        result = office.getMeetingRoomsWithGivenNamePart("Small");
        assertEquals("Smaller Room", result.get(0).getName());
        assertEquals("Smallest Room", result.get(1).getName());
    }

    @Test
    void testGetMeetingRoomsWithAreaLargerThan() {
        List<MeetingRoom> result = office.getMeetingRoomsWithAreaLargerThan(25);
        assertEquals(3, result.size());
        assertEquals("Big Room", result.get(0).getName());
    }
}