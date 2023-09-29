## Absztrakció (30 pont)

A feladatban egy jármű bérlő (car/bike sharing) alkalmazás működését fogjuk szimulálni.  

Készíts egy `Rentable` interface-t, aminek publikus absztrakt metódusai: `void rent(User user, int km)`, `void closeRent()`, 
`boolean isFree()` és a `String getId()`  

A `User` osztály a felhasználót reprezentálja, akinek van egy felhasználóneve, amit konstruktorban kap meg, és egy korábbi bérlések
listája, ami kezdetben üres. Legyen egy `void addEarlierRent(Rentable rentable)` metódusa amivel hozzá lehet adni bérlést a listához!

A `RentingData` osztály egy bérlés adatait tartalmazza. Attribútumai egy `User actualUser` és egy `int actualKm`, melyek azt jelölik, hogy ki
és hány kilométerre szeretné kibérelni majd a járművet. Legyen egy `void addEarlierRentToUser(Rentable rentable)` metódusa, 
ami delegálja a hivást az `actualUser` megfelelő metódusának! 

A `Bike` osztály implementálja a `Rentable` interface-t. Adattagjai egy `String id` egy `RentingData rentingData` és egy `int sumKm`. 
Ezek közül az `id`-t kapja meg konstruktorban. A `rent(User user,int km)` metódust definiáld felül úgy, hogyha a `rentingData`
értéke nem `null`, akkor dobjon kivételt! Egyéb esetben a `rentingData` kapjon új értéket, átadva neki a paramétereket!  
A `closeRent()` metódus dobjon kivételt, ha épp nincs kibérelve a bicikli! Egyébként az összkilométerhez add hozzá a bérlés kilométer adatát,
és a bérlő listájához add hozzá az aktuális bicikli objektumot! Mindezek után töröld a bérlési adatokat! 
A `boolean isFree()` és a `getId()` metódust értelemszerűen definiáld felül!

A `Car` osztály implementálja a `Rentable` interface-t.  Adattagjai egy `String id` egy `RentingData rentingData` 
és egy `int distanceCanMake`. Utóbbi megmondja, hogy hány kilometert képes még menni az autó. Az `id` és a `distanceCanMake` 
attribútumokat konstruktorban állítsuk be, illetve utóbbihoz legyen egy metódus, ami a tankolást reprezentálja, azaz hozzáadja a
`distanceCanMake` értékhez a paraméterül kapott értéket! 
A bérlés hasonló, mint a biciklinél, azzal a különbséggel, hogy azt is vizsgálni kell, hogy képes-e ennyi kilométert megtenni az autó.
A bérlés lezárásnál ugyanaz a menet mint a bringánál, de a `distanceCanMake` attribútumot csökkenteni kell a megtett kilométerrel. 
A `boolean isFree()` és a `getId()` metódust értelemszerűen definiáld felül!

## Algoritmus 2 (15 pont)

A `User` osztályt bővítsd egy metódussal, ami megmondja, hogy a korábban bérelt járművek közül hány van, ami éppen szabad!








