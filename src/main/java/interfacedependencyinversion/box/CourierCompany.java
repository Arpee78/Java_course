package interfacedependencyinversion.box;

public class CourierCompany {

    public static void main(String[] args) {

        Box smallBox = new SmallBox();
        Box mediumBox = new MediumBox();
        Box largeBox = new LargeBox();
        Box extraLargeBox = new ExtraLargeBox();

        System.out.println("Size: " + smallBox.getSize().name() + "   Price: " + smallBox.getPrice());
        System.out.println("Size: " + mediumBox.getSize().name() + "   Price: " + mediumBox.getPrice());
        System.out.println("Size: " + largeBox.getSize().name() + "   Price: " + largeBox.getPrice());
        System.out.println("Size: " + extraLargeBox.getSize().name() + "   Price: " + extraLargeBox.getPrice());
    }
}
