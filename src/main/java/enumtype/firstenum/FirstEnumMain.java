package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        for (Continent c : Continent.values()) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println();
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("INDIAN"));

        System.out.println();
        System.out.println(Football.FORWARD.name());
        System.out.println(Football.MIDFIELDER.name());
        System.out.println(Football.DEFENDER.name());
        System.out.println(Football.GOALKEEPER.name());

    }

}
