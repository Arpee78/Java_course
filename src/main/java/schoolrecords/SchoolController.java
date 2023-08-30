//package schoolrecords;
//
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Random;
//import java.util.Scanner;
//
//public class SchoolController {
//
//    private ClassRecords classRecords;
//    private School school;
//    Scanner scanner = new Scanner(System.in);
//    private final int menuExit = 9;
//
//    public static void main(String[] args) {
//        SchoolController controller = new SchoolController();
//        controller.school = new School(Path.of("src/main/resources/school.csv"));
//        controller.classRecords = new ClassRecords("4/A", new Random());
//        controller.initClass();
//        controller.runMenu();
//    }
//
//    private void runMenu() {
//        int choice = 0;
//        do {
//            printMenu();
//            System.out.print("Kérem, adja meg a menüpont számát: ");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException nfe) {
//                System.out.println("Adjon meg egy egész számot!");
//                throw new IllegalArgumentException("Not a number", nfe);
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("Diákok: " + classRecords.listStudentNames());
//                    break;
//                case 2:
//                    System.out.print("A keresett diák neve: ");
//                    Student studentToFind = classRecords.findStudentByName(scanner.nextLine());
//                    System.out.println(studentToFind);
//                    break;
//                case 3:
//                    System.out.print("A új diák neve: ");
//                    classRecords.addStudent(scanner.nextLine());
//                    break;
//                case 4:
//                    System.out.print("A törlendő diák neve: ");
//                    classRecords.removeStudent(scanner.nextLine());
//                    break;
//                case 5:
//                    studentRepetition();
//                     break;
//                case 6:
//                    System.out.print("Tantárgy neve: ");
//                    System.out.println(classRecords.calculateClassAverageBySubject(scanner.nextLine()));
//                    break;
//                case 7:
//                    System.out.print("Tantárgy neve: ");
//                    System.out.println(classRecords.listSubjectResults(scanner.nextLine()));
//                    break;
//                case 8:
//                    System.out.print("Diák neve: ");
//                    Student student = classRecords.findStudentByName(scanner.nextLine());
//                    System.out.print("Tantárgy: ");
//                    System.out.println(student.calculateSubjectAverage(scanner.nextLine()));
//                    break;
//                case 9:
//                    System.out.println("Viszontlátásra");
//                    break;
//                default:
//                    System.out.println("Nem értelmezhető");
//            }
//
//        } while (choice != menuExit);
//    }
//
//    private void studentRepetition(){
//        Student repetitioned = classRecords.repetition();
//        System.out.print("A mai felelő: " + repetitioned.getName());
//        System.out.print("  Kérem a jegyet: ");
//        int markValue=0;
//        try{
//            markValue = Integer.parseInt(scanner.nextLine());
//        } catch (NumberFormatException nfe){
//            System.out.println("Pozitív egész számot adj meg 1 és 5 között");
//        }
//        System.out.print("Kérem a tárgy nevét: ");
//        String subjectName = scanner.nextLine();
//        System.out.print("Kérem a tanár nevét: ");
//        String tutorName = scanner.nextLine();
//
//        Mark actualMark = new Mark(findMarkTypeByValue(markValue), school.findSubjectByName(subjectName), school.findTutorByName(tutorName));
//        repetitioned.addGrading(actualMark);
//    }
//
//    private MarkType findMarkTypeByValue(int markValue){
//        switch (markValue){
//            case 1: return MarkType.F;
//            case 2: return MarkType.D;
//            case 3: return MarkType.C;
//            case 4: return MarkType.B;
//            case 5: return MarkType.A;
//        }
//        throw new IllegalArgumentException("Cannot find mark with this value!");
//    }
//
//    private void printMenu() {
//        System.out.println();
//        System.out.println("1. Diákok nevének listázása\n" +
//                "2. Diák név alapján keresése\n" +
//                "3. Diák létrehozása\n" +
//                "4. Diák név alapján törlése\n" +
//                "5. Diák feleltetése\n" +
//                "6. Tantárgyi osztályátlag kiszámolása\n" +
//                "7. Diákok átlagának listázása egy tantárgyból\n" +
//                "8. Egy diák egy tantárgyhoz tartozó átlagának kiszámolása\n" +
//                "9. Kilépés");
//    }
//
//    private void initClass() {
//        School school = new School(Paths.get("src/test/resources/school.csv"));
//        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
//        classRecords.addStudent("Kovács Rita");
//        classRecords.addStudent("Nagy Béla");
//        classRecords.addStudent("Varga Márton");
//        Student firstStudent = classRecords.findStudentByName("Kovács Rita");
//        firstStudent.addGrading(new Mark(MarkType.A, school.findSubjectByName("földrajz"), school.findTutorByName("Dienes Irén")));
//        firstStudent.addGrading(new Mark(MarkType.C, school.findSubjectByName("matematika"), school.findTutorByName("Szabó László")));
//        firstStudent.addGrading(new Mark(MarkType.D, school.findSubjectByName("földrajz"), school.findTutorByName("Dienes Irén")));
//        Student secondStudent = classRecords.findStudentByName("Nagy Béla");
//        secondStudent.addGrading(new Mark(MarkType.A, school.findSubjectByName("biológia"), school.findTutorByName("Dienes Irén")));
//        secondStudent.addGrading(new Mark(MarkType.C, school.findSubjectByName("matematika"), school.findTutorByName("Tóth Ilona")));
//        secondStudent.addGrading(new Mark(MarkType.D, school.findSubjectByName("ének-zene"), school.findTutorByName("Németh Lili")));
//        Student thirdStudent = classRecords.findStudentByName("Varga Márton");
//        thirdStudent.addGrading(new Mark(MarkType.A, school.findSubjectByName("fizika"), school.findTutorByName("Kiss József")));
//        thirdStudent.addGrading(new Mark(MarkType.C, school.findSubjectByName("kémia"), school.findTutorByName("Kiss József")));
//        thirdStudent.addGrading(new Mark(MarkType.D, school.findSubjectByName("földrajz"), school.findTutorByName("Tóth Ilona")));
//    }
//}
