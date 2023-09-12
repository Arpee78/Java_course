package interfacedefaultmethods.cloth;

public interface Square {

    //visszaadja egy négyzet oldalainak számát.
    default int getNumberOfSides() {
        return 4;
    }

    //az oldal hosszának ismeretében visszaadja a négyzet átlójának hosszát.
    default double getLengthOfDiagonal() {
        return getSide() * Math.sqrt(2);
    }

    //az oldal hosszának ismeretében visszaadja a négyzet kerületét.
    default double getPerimeter() {
        return getSide()*4;
    }

    //az oldal hosszának ismeretében visszaadja a négyzet területét.
    default double getArea() {
        return getSide()*getSide();
    }

    abstract double getSide();
}
