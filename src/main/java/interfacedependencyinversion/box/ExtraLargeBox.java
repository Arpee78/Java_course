package interfacedependencyinversion.box;

public class ExtraLargeBox implements Box{

    private Size size = Size.XL;
    private int price = 5000;

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
