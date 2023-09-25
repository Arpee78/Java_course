## Fájlok (25 pont)

Készíts egy `File` nevű interface-t a következő publikus absztrakt metódusokkal:  
`String getFullName()` és `double calculateSize()`! A fájl teljes neve majd mindig a címe és kiterjesztése lesz ponttal elválasztva. A méret számítást az egyes osztályoknál definiáljuk.
Legyen benne egy statikus attribútum ami a kilobyte-ból megabyte-ba történő
átváltás váltószáma, ennek értéke `0.001`!

Legyen egy `TextFile` nevű osztály mely implementálja a `File` interface-t! Az osztálynak legyen
egy cím attribútuma és egy `String` listája, ami a fájlban lévő sorokat jelképezi! Ezek közül 
példányosításkor csak a címet kapja meg. Legyen egy metódus amivel sort lehet hozzáadni a listához!
Az ilyen fájlok kiterjesztése mindig `txt`. A fájl mérete annyi kilobyte ahány sor van benne, de az
eredményt megabyte-ban várjuk.  

Legyen egy `Picture` nevű osztály, ami implemetálja a `File` interface-t! Az osztálynak legyen egy cím, egy kiterjesztés,
egy szélesség és egy magasság attribútuma, típusaik rendre szöveg, szöveg, egész szám, egész szám és ezek mindegyikét konstruktorban kapja meg!
A kép mérete annyi kilobyte mint a benne lévő pixelek száma, az értéket itt is megabyte-ban várjuk.   

Legyen még egy `ZipFile` nevű osztályt, ami implementálja a `File` interface-t! Az osztálynak
legyen egy cím attribútuma illetve `File` típusú elemek listája! Mindkettőt konstruktorban kapja meg. A kiterjesztés
itt mindig `zip`. A fájl mérete pedig a benne lévő fájlméretek összegének a 20%-a. 

## Fájlok algoritmusok (15 pont)

Bővítsd az előző osztályban található `ZipFile` osztályt egy metódussal ami visszaadja a legnagyobb méretű file-t a tömörített fájlból!
Figyelj, hogy üres könyvtárat is be lehet tömöríteni, ekkor dobjunk `IllegalStateException`-t! Ha több azonos méretű fájl van,
akkor az elsőt add vissza! 







