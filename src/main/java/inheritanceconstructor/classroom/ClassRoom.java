package inheritanceconstructor.classroom;

public class ClassRoom extends Room {

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course) {
        System.out.println();
        boolean facilityOk = facility.name().equals(course.getFacilityNeeded().name());
        boolean capacityOk = getCapacity()>=course.getParticipants();
        return facilityOk && capacityOk;
    }

    public Facility getFacility() {
        return facility;
    }
}
