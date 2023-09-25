### Város 1. rész (30 pont)
A következő osztályokat a `city` comagba készítsd el.<br>

Készíts egy `Address` nevű osztályt, ami egy utcát és egy házszámot tárol.<br>
 
Legyen egy `Building` nevű absztrakt osztályod. Ennek attribútumai egy alapterület, szintek száma és a cím. 
Legyen két konstruktora. Az egyikben mindent állítsunk be, a másik csak az alapterületet és a címet várja, 
ekkor a szintek száma egy legyen. Legyen ezekhez getter illetve egy `getFullArea()` metódus, ami az alapterületet 
szorozza a szintek számával. Legyen még egy absztrakt `int calculateNumberOfPeopleCanFit()` metódus, ami azt 
reprezentálja, hogy hány ember fér be az épületbe. <br>
 
Hozd létre a `Home` nevű osztályt, ami egy otthont reprezentál és az épületből származik. Otthont is ugyanúgy 
lehessen létrehozni mint épületet, de arra figyeljünk, hogy a szintek száma legfeljebb 3 lehet. Ha ez nem teljesül, 
dobjunk kivételt! Legyen egy konstans attribútuma amit állítsunk be 20-ra. Ez az attribútum azt mutatja, hogy egy 
embernek legalább hány négyzetméterre van szüksége otthon. Ez alapján definiáld felül a `calculateNumberOfPeopleCanFit()` 
metódust. <br>

Hozd létre az `Office` nevű osztályt. Ebben extra attribútumként szerepel a cég neve, és szintenként az 
asztalok száma. Figyeljünk arra, hogy az asztalok számát úgy kell megadni, hogy egy asztalnak legalább 2 és 
legfeljebb 5 négyzetméterre van szüksége. Ha ez nem teljesül dobjunk kivételt! Minden irodában van egy emelet 
ami szórakozásra és pihenésre ad lehetőséget. Az irodába annyi ember fér be ahány asztal van emeletenként 
leszámítva a "szórakozó" emeletet. <br>

Hozd létre a `City` nevű osztályt. Minden városnak van egy neve, egy teljes területe (`long`) és épületeinek 
listája. Lehessen épületet hozzáadni a városhoz, de csak akkor, ha a hozzáadni kívánt épülettel nem lépjük 
túl a város alapterületét!

### Város 2. rész (25 pont)
A városban megvalósítandó további metódusok.
* A `Building findHighestBuilding()` megkeresi a legmagasabb épületet a városban (legtöbb szintű). 
  Ha több ilyen is van akkor az elsőt.

* Szűrd le az egy utcába tartozó épületeket egy listába:  `findBuildingsByStreet(String street)`

* Írjunk metódust, ami eldönti van-e olyan épület, amibe egy bizonyos számú embernél több ember fér be. 
  (`boolean isThereBuildingWithMorePeopleThan(int numberOfPeople)`)


 
