package meetingrooms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    private void runMenu() {
        System.out.print("Üdvözöljük! Hány tárgyalót szeretne rögzíteni? ");

        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        readMeetingRooms(count);
//        office.addMeetingRoom("Huge room", 15, 40);
//        office.addMeetingRoom("Big room", 10, 30);
//        office.addMeetingRoom("Medium room", 8, 25);
//        office.addMeetingRoom("Small room", 5, 20);
//        office.addMeetingRoom("Smallest room", 2, 10);

        boolean continueOrNot;
        do {
            System.out.println();
            printMenu();

            int request = scanner.nextInt();
            scanner.nextLine();

            continueOrNot = chooseMenuItem(request);
        } while (continueOrNot);

    }

    private boolean chooseMenuItem(int request) {
        if (request == 1) {
            System.out.println("Tárgyalók neve sorrendben:");
            printNames(office.getMeetingRooms());
        }
        if (request == 2) {
            System.out.println("Tárgyalók neve fordított sorrendben:");
            printNames(office.getMeetingRoomsInReverseOrder());

        }
        if (request == 3) {
            System.out.print("Páratlan(1) vagy páros(2) ");
            int evenOdd = scanner.nextInt();
            System.out.println("A " + (evenOdd == 1 ? "páratlan" : "páros") + " számú tárgyalók:");
            printNames(office.getEverySecondMeetingRoom(evenOdd));
            scanner.nextLine();
        }
        if (request == 4) {
            System.out.println("A tárgyalók adatai: ");
            printMeetingRooms(office.getMeetingRooms());
        }
        if (request == 5) {
            System.out.print("Tárgyaló neve? ");
            String name = scanner.nextLine();
            System.out.println("A kért tárgyaló adatai: ");
            MeetingRoom meetingRoom = office.getMeetingRoomWithGivenName(name);
            if (meetingRoom != null) {
                printMeetingRoom(meetingRoom);
            }
        }
        if (request == 6) {
            System.out.print("Tárgyaló részleges neve? ");
            String namePart = scanner.nextLine();
            System.out.println("A kért tárgyalók adatai: ");
            List<MeetingRoom> meetingRoom = office.getMeetingRoomsWithGivenNamePart(namePart);
            if (meetingRoom != null) {
                printMeetingRooms(meetingRoom);
            }
        }
        if (request == 7) {
            System.out.print("Tárgyalók amelyek nagyobb területűek mint: ");
            int area = scanner.nextInt();
            System.out.println("A kért tárgyalók adatai: ");
            List<MeetingRoom> meetingRoom = office.getMeetingRoomsWithAreaLargerThan(area);
            scanner.nextLine();
            if (meetingRoom.size() > 0) {
                printMeetingRooms(meetingRoom);
            }
        }
        if (request == 8) {
            System.out.println("Viszontlátásra!");
            return false;
        }
        if (request < 1 || request > 8) {
            System.out.println("Ismeretlen menüpont");
        }

        return true;
    }

    private void printNames(List<MeetingRoom> meetingRooms) {
        boolean first = true;
        for (MeetingRoom actual : meetingRooms) {
            String name = actual.getName();
            if (first) {
                first = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(name);
        }
        System.out.println();
    }

    private void printMeetingRooms(List<MeetingRoom> meetingRooms) {
        for (MeetingRoom actual : meetingRooms) {
            printMeetingRoom(actual);
        }
    }

    private void printMeetingRoom(MeetingRoom meetingRoom) {
        System.out.println("Név: " + meetingRoom.getName()
                + ", szélesség: " + meetingRoom.getWidth() + "m"
                + ", hosszúság: " + meetingRoom.getLength() + "m"
                + ", terület: " + meetingRoom.getArea() + "m2"
        );
    }

    private void readMeetingRooms(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("Tárgyaló neve? ");
            String name = scanner.nextLine();

            System.out.print(name + " szélessége? ");
            int width = scanner.nextInt();
            scanner.nextLine();

            System.out.print(name + " hosszúsága? ");
            int length = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            office.addMeetingRoom(name, width, length);
        }
    }

    private void printMenu() {
        System.out.print("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján\n" +
                "8. Kilépés\n" +
                "Mit szeretnél tenni? Add meg a sorszámát. "
        );
    }
}

