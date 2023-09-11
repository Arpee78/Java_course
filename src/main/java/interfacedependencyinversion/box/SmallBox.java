package interfacedependencyinversion.box;

public class SmallBox implements Box{

    private Size size = Size.S;
    private int price = 1000;

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
