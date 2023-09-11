package interfacedependencyinversion.box;

public class MediumBox implements Box{

    private Size size = Size.M;
    private int price = 2000;

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
