A `redlion` csomagba dolgozz!

### 1. feladatrész (15 pont):

Hozd létre a `Cup` osztályt, amelynek attribútumai: (fantázia)név (szöveg), ár (egész szám) és fajta! Ez utóbbit egy `Sort` nevű enummal
add meg, amely a következő felsorolókat tartalmazza: `BLACK_TEA, GREEN_TEA, ROOIBOS, HERBAL_TEA, FRUIT_TEA`! Az enumnak legyen egy
`String additionalInfo` attribútuma is, amely az egyes teafajtákhoz tartozó plusz tudnivalókat tartalmazza: a fekete
cup "élénkítő hatású", a zöld cup "méregtelenít", a rooibos cup "tele van antioxidánsokkal", a gyógyteának "sok különféle
gyógyhatása van", a gyümölcstea pedig egyszerűen csak "finom, édes ízű".

Az osztályban legyen egy konstruktor, ami beállítja az attribútumok kezdőértékeit, illetve getterek. Az árhoz legyen
setter metódus is! Az enumban is legyen konstruktor és getter! Készíts az osztályban egy felülírt `toString()`
metódust is!

### 2. feladatrész (20 pont):

Hozd létre a `RedLion` osztályt, amelynek legyen egy neve (szöveg), egy listája a náluk kapható teafajtákról
(`List<Cup>` típusú), egy nyitási és egy zárási időpontja (mindkettő `LocalTime` típusú)! A lista kezdetben ne legyen üres,
hanem eleve tartalmazzon már két teafajtát (`new Cup("Kamillavirágzat", 1256, Sort.HERBAL_TEA)` és
`new Cup("Cseresznyés álom", 1745, Sort.FRUIT_TEA)` adatokkal)! De tartozzon a listához egy `void addCup(Cup cup)` metódus is,
amellyel fel lehet tölteni további elemekkel! Minden attribútumhoz tartozzon getter!
Legyen az osztályban egy `void setActionPrices(Sort sort, int percent)` metódus, amelynek segítségével minden, a listában szereplő,
megadott fajtájú cup árát egyszerre lehet csökkenteni egy megadott százalékkal. Az akciós ár `int` típusú legyen, az adott százalékkal
való csökkentés után kapott árat kerekítsd lefelé!
Legyen az osztályban egy `double getAveragePrice()` is, amely visszaadja a listában található teák átlagárát!
