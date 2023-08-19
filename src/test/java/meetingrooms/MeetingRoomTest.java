package meetingrooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {

    MeetingRoom meetingRoom = new MeetingRoom("Big room", 10,20);

    @Test
    void testCreateRoom(){
        assertEquals("Big room", meetingRoom.getName());
        assertEquals(10, meetingRoom.getWidth());
        assertEquals(20, meetingRoom.getLength());
    }

    @Test
    void testGetArea() {
        assertEquals(200, meetingRoom.getArea());
    }
}