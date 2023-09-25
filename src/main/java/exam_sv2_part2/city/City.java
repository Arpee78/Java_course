package exam_sv2_part2.city;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private long fullArea;
    List<Building> buildings = new ArrayList<>();

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        checkTooManyBuildings(building);
        buildings.add(building);
    }

    private void checkTooManyBuildings(Building building) {
        int sum = building.getArea();
        for (Building b : buildings) {
            sum += b.getArea();
        }
        if (sum > fullArea) {
            throw new IllegalArgumentException("City can't be larger than " + fullArea);
        }
    }

    public Building findHighestBuilding() {
        Building highest = buildings.get(0);
        for (Building b : buildings) {
            if (b.getLevels() > highest.getLevels()) {
                highest = b;
            }
        }
        return highest;
    }

    public List<Building> findBuildingsByStreet(String street) {
        List<Building> result = new ArrayList<>();
        for (Building b : buildings) {
            if (b.getAddress().getStreet().equals(street)){
                result.add(b);
            }
        }
        return result;
    }

    public boolean isThereBuildingWithMorePeopleThan(int numberOfPeople){
        for (Building b : buildings) {
            if (b.calculateNumberOfPeopleCanFit()>numberOfPeople){
                return true;
            }
        }
        return false;
    }
}
