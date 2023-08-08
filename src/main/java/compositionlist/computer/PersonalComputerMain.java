package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        PersonalComputer personalComputer = new PersonalComputer(new Cpu("Intel i5-4670", 3.3));

        Hardware mobo = new Hardware("Motherboard", "Gigabyte gs30");
        Hardware ram = new Hardware("RAM", "Crucial cx40");
        Hardware ssd = new Hardware("SSD", "Samsung 128Gb");
        personalComputer.addHardware(mobo);
        personalComputer.addHardware(ram);
        personalComputer.addHardware(ssd);

        Software windows = new Software("Windows",10);
        personalComputer.addSoftware(windows);

        System.out.println(personalComputer.getCpu());
        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftwares());
    }
}
