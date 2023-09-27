
## Absztrakció (30 pont)

A feladatban egy Streaming szolgáltató működését fogjuk szimulálni.  
Hozz létre egy `Content` nevű interface-t két publikus abstract metódussal, `String getTitle()` és 
`int getLength()`, illetve egy `void addVideo(Video video)` metódussal, ami alapértelmezetten
egy `IllegalStateException`-t dob a megfelelő hibaüzenettel!  

Készíts egy `Video` osztályt! Minden videónak legyen egy címe és egy hossza, ezeket konstruktorban állítsd be!  

Készíts egy `Movie` osztályt, melynek adattagja egy video és implementálja a 
`Content` interface-t! Az interface absztract metódusait úgy írd felül, hogy
a video attribútum megfelelő adattagjaival térjenek vissza!

Készíts egy `Series` osztályt, amely szintén implementálja a `Content` interface-t!
Ennek az osztálynak legyen egy címe és videók listája attribútuma! Sorozatot kétféleképpen 
lehet létrehozni. Mindkét esetben megadom a címet, de az egyik esetben csak az első videót adom meg,
míg a második esetben az sorozathoz tartozó összes videót feltöltöm egyben. A `Series`
osztály minden `Content` interface metódust definiáljon felül a következő módon: a cím maga a sorozat címe legyen, a
hossz pedig a benne lévő videók hosszának összege. Az `addVideo(Video video)` metódussal
pedig lehessen videót hozzáadni a listához.  

Készíts egy `StreamingPlatform` nevű osztályt, amelyben tartalmak listája található
és benne egy `addContent(Content content)` metódust, amivel tartalmat lehet hozzáadni a listához! 

## Algoritmus 2 (15 pont)

Bővítsd a `StreamingPlatform` osztályt egy metódussal, ami megkeresi és visszaadja a leghosszabb tartalmat a listában!
Figyelj az üres listára!







