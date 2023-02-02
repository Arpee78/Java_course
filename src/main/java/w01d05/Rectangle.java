package w01d05;

public class Rectangle {
    //Készíts egy w01d05.Rectangle (téglalap) nevű osztályt, amelynek két attribútuma a téglalap két oldalának hossza!
    // Készíts egy konstruktort, ami beállítja az attribútumok kezdeti értékét!
    // Készíts egy calculateArea() nevű metódust, ami visszaadja a téglalap területét!

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int calculateArea(){
        return sideA * sideB;
    }
}
