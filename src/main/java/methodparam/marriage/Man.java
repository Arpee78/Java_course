package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Man {

    private String name;
    private List<RegisterDate> registerDates;

    public Man(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return new ArrayList<>(registerDates);
    }

    public void addRegisterDate(RegisterDate registerDate){
        registerDates.add(registerDate);
    }

}
