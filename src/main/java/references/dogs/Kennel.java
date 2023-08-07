package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        // Hozz létre egy üres `List<Dog> dogs` listát, amelyben az osztály a hozzá tartozó kutyákat fogja nyilvántartani!
        List<Dog> dogList1 = new ArrayList<>();

        // Példányosíts három különböző `Dog`-ot, és mindhármat add hozzá a listához!
        Dog dog1 = new Dog("Morzsi", 5, "barna");
        dogList1.add(dog1);

        Dog dog2 = new Dog("Rex", 2, "fekete");
        dogList1.add(dog2);

        Dog dog3 = new Dog("Cézár", 8, "fehér");
        dogList1.add(dog3);

        // Írd ki a konzolra a lista tartalmát!
        System.out.println(dogList1);

        // Majd definiálj egy új (negyedik) `Dog` típusú változót, amelynek add értékül a lista 1-es indexű elemét!
        // A most definiált változónév használatával változtasd meg a kutya színét!
        Dog dog4 = dogList1.get(1);
        dog4.setColour("foltos");

        // Újra írd ki a konzolra a lista tartalmát!
        System.out.println(dogList1);

        // Definiálj egy újabb (ötödik) `Dog` típusú változót, melynek adj értékül egy újonnan példányosított objektumot!
        // Írd is ki a konzolra ennek a példánynak az adatait!
        Dog dog5 = new Dog("Buksi", 12, "világosbarna");
        System.out.println(dog5);

        // Az előző lépésben definiált változónak add értékül a kutyalista 1-es indexű elemét! Írd ki a
        // konzolra a változó értékét!
        dog5 = dogList1.get(1);
        System.out.println(dog5);

        // A listához add hozzá az előző változó által hivatkozott példányt! Írd ki a konzolra a lista tartalmát!
        dogList1.add(dog5);
        System.out.println(dogList1);

        // Definiálj megint egy (hatodik) `Dog` típusú változót, majd add neki értékül a korábbi, negyedik `Dog` típusú változó
        // értékét! A most definiált változó nevének használatával változtasd meg a kutya színét!
        Dog dog6 = dog4;
        dog6.setColour("fekete-fehér foltos");

        // Újra írd ki a konzolra a lista tartalmát!
        System.out.println(dogList1);

        // Definiálj egy második `List<Dog>` típusú listát, melynek add értékül az első listát!
        List<Dog> dogList2 = dogList1;

        // Definiálj megint egy (hetedik) `Dog` típusú változót, majd ennek is add értékül a korábbi, negyedik `Dog` típusú változó
        // értékét! A most definiált változó nevének használatával újra változtasd meg a kutya színét!
        Dog dog7 = dog4;
        dog7.setColour("csíkos");

        // Újra írd ki a konzolra a lista tartalmát, immár a második `List<Dog>` típusú változó nevének használatával!
        System.out.println(dogList2);

        // Az eredetileg létrehozott, másodikként definiált `Dog` típusú változó nevének használatával változtasd meg
        // a kutya színét! Írd ki újra a konzolra a lista tartalmát, a második `List<Dog>` típusú változó nevének használatával!
        dog2.setColour("tigriscsíkos");
        System.out.println(dogList2);

        // Az eredetileg létrehozott, másodikként definiált `Dog` típusú változó értékét változtasd meg `null`-ra!
        // Írd ki újra a konzolra a lista tartalmát, a második `List<Dog>` típusú változó nevének használatával!
        dog2 = null;
        System.out.println(dogList2);

        // Definiálj egy újabb (nyolcadik) `Dog` típusú változót, majd add neki értékül az első kutyalista 1-es
        // indexű elemét! Majd állítsd át az értékét `null`-ra! Írd ki újra a konzolra a lista tartalmát, a második `List<Dog>`
        // típusú változó nevének használatával!
        Dog dog8 = dogList1.get(1);
        dog8 = null;
        System.out.println(dogList2);

        // Definiálj egy utolsó (kilencedik) `Dog` típusú változót, majd add neki értékül az első lista 1-es
        // indexű elemét! A most definiált változó nevének használatával változtasd meg a kutya színét! Írd ki újra a
        // konzolra a lista tartalmát, a második `List<Dog>` típusú változó nevének használatával!
        Dog dog9 = dogList1.get(1);
        dog9.setColour("sárga-fekete tigriscsíkos");
        System.out.println(dogList2);
    }
}
