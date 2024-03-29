package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Woman {

    private String name;
    private List<RegisterDate> registerDates;

    public Woman(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return new ArrayList<>(registerDates);
    }

    public void addRegisterDate(RegisterDate registerDate){
        registerDates.add(registerDate);
    }

}
