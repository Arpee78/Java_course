package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {

    private List<String> colors = new ArrayList<>();

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void addLast(String color) {
        colors.add(color);
    }

    public void addFirst(String color) {
        colors.add(0, color);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size()-1);
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        List<String> colorsToAdd = new ArrayList<>(Arrays.asList("kék", "sárga", "lila", "zöld", "narancs"));
        capsules.setColors(colorsToAdd);
        System.out.println(capsules.getColors());

        capsules.addLast("piros");
        System.out.println(capsules.getColors());

        capsules.addFirst("pink");
        System.out.println(capsules.getColors());

        capsules.removeLast();
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());

    }

}
