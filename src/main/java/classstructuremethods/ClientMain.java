package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Joe");
        client.setYear(1980);
        client.setAddress("Veszprém");

        System.out.println("Name: " + client.getName() + "   Year: " + client.getYear() + "   Address: " + client.getAddress());

        client.migrate("Szeged");

        System.out.println("Költöztél, az új címed: " + client.getAddress());
    }
}
