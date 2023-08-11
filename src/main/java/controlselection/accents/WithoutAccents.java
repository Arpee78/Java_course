package controlselection.accents;

public class WithoutAccents {

    public char getWithoutAccent(char c) {

        String withAccent = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
        String withOutAccent = "aeiooouuuAEIOOOUUU";

        int index = withAccent.indexOf(c);

        if (index >= 0) {
            return withOutAccent.charAt(index);
        } else {
            return c;
        }

    }
}
