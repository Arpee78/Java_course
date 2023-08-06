package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Georgiana Jenifer");
        names.add("Hortense Norah");
        names.add("Joi Emil");
        names.add("Daria Cherilyn");
        names.add("Modesty Kalla");
        names.add("Doria Regena");
        names.add("Kadence Hallie");
        names.add("Fredric Kevyn");
        names.add("Tabitha Dolph");
        names.add("Laryn Landyn");

        Random random = new Random();
        int rnd1 = random.nextInt(5) + 1;
        int rnd2 = random.nextInt(5) + 6;

        System.out.println("Egyik nyertes: " + names.get(rnd1 - 1));
        System.out.println("Másik nyertes: " + names.get(rnd2 - 1));
    }
}
