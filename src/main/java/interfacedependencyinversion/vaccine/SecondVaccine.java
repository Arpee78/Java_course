package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        for (Person p : registered) {
            boolean pregnant = p.getPregnant().equals(Pregnancy.YES);
            boolean chronic = p.getChronic().equals(ChronicDisease.YES);
            if (p.getAge() <= 65 && !pregnant && !chronic) {
                vaccinationList.add(p);
            }
        }

        for (Person p : registered) {
            boolean pregnant = p.getPregnant().equals(Pregnancy.YES);
            boolean chronic = p.getChronic().equals(ChronicDisease.YES);
            if (p.getAge() > 65 && !pregnant && !chronic) {
                vaccinationList.add(p);
            }
        }
    }
}
