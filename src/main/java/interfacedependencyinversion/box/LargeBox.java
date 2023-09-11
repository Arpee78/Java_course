package interfacedependencyinversion.box;

public class LargeBox implements Box{

    private Size size = Size.L;
    private int price = 3000;

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
