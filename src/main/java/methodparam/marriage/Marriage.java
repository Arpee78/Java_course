package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        man.addRegisterDate(new RegisterDate("Házasság", LocalDate.now()));
        woman.addRegisterDate(new RegisterDate("Házasság", LocalDate.now()));
        setWomanMarriedName(woman, man.getName());
    }

    private void setWomanMarriedName(Woman woman, String name) {
        String[] names = name.split(" ");
        String husbandLastName = names[0];
        woman.setName(husbandLastName + "-" + woman.getName());
    }
}
