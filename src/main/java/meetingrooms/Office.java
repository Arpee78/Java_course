package meetingrooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name, int width, int length) {
        meetingRooms.add(new MeetingRoom(name, width, length));
    }

    public List<MeetingRoom> getMeetingRooms() {
        return new ArrayList<>(meetingRooms);
    }

    public List<MeetingRoom> getMeetingRoomsInReverseOrder() {
        int roomCount = meetingRooms.size();
        MeetingRoom[] reverseOrder = new MeetingRoom[roomCount];
        for (int i = 0; i < roomCount; i++) {
            reverseOrder[i] = meetingRooms.get(roomCount - i - 1);
        }
        return Arrays.asList(reverseOrder);
    }

    public List<MeetingRoom> getEverySecondMeetingRoom(int number) {
        List<MeetingRoom> everySecond = new ArrayList<>();
        for (int i = number - 1; i < meetingRooms.size(); i += 2) {
            everySecond.add(meetingRooms.get(i));
        }
        return everySecond;
    }

    public MeetingRoom getMeetingRoomWithGivenName(String name) {
        for (MeetingRoom actual : meetingRooms) {
            if (actual.getName().equalsIgnoreCase(name)) {
                return actual;
            }
        }
        return null;
    }

    public List<MeetingRoom> getMeetingRoomsWithGivenNamePart(String namePart) {
        List<MeetingRoom> result = new ArrayList<>();
        for (MeetingRoom actual : meetingRooms) {
            String nameLowerCase = actual.getName().toLowerCase();
            String namePartLowerCase = namePart.toLowerCase();
            if (nameLowerCase.contains(namePartLowerCase)) {
                result.add(actual);
            }
        }
        if (result.size()>0){
            return result;
        } else {
            return null;
        }

    }

    public List<MeetingRoom> getMeetingRoomsWithAreaLargerThan(int area) {
        List<MeetingRoom> result = new ArrayList<>();
        for (MeetingRoom actual : meetingRooms) {
            if (actual.getArea() > area) {
                result.add(actual);
            }
        }
        return result;
    }


}
