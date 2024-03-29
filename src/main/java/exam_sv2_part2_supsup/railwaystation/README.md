## Pályaudvar

### 1. rész (30 pont)

A következő osztályokat a `railwaystation` csomagba készítsd el!

Készíts egy `Train` absztrakt osztályt, amelynek attribútumai egy vonat neve (mint pl. "Erkel Ferenc Intercity") és 
a vagonjainak száma. Legyen az osztályban egy konstans attribútum is, amelyben eltároljuk, hogy egy vonat egy vagonjának 
hossza 15 méter. Figyelj arra, hogy a név attribútumot leszármazott osztályból is be kell tudni állítani (ehhez el is kell 
tudni érni)! Vonatot úgy lehessen létrehozni, hogy megadjuk a vagonok számát! Legyen még egy `getTotalLength()` nevű 
metódus az osztályban, amely visszaadja a vonat teljes hosszát (a vagonok számának és hosszának szorzata), valamint egy 
absztrakt metódus: `int calculateTravellingPeople()`!

Öröklődjön a `Train` osztályból egy `PassengerTrain` osztály! Ennek legyen egy további attribútuma: `boolean hasDiningCar` 
Kétféle módon lehessen személyszállító vonatot létrehozni: ha csak a vagonok számát adom meg, akkor a vonat nem kap 
nevet és nem is szállít étkezőkocsit. A másik módon való létrehozáskor meg kelljen adni a vonat nevét is, és ebben az 
esetben a vonat alapértelmezetten szállítson magával étkezőkocsit is!
A `calculateTravellingPeople()` metódus megvalósításához tudni kell, hogy egy személykocsiban 70 ember utazik.
A kétféle módon létrehozott személyszállító vonatok esetében a metódus kétféle értéket is adjon vissza: ha van 
a vonaton étkezőkocsi, akkor abban nem utazik senki, vagyis csak az összes többi vagont kell 
számításba venni (egy vonaton egy étkezőkocsi van). Ha viszont nincs a vonaton étkezőkocsi, akkor pedig 
minden kocsiban emberek utaznak.

A `CargoTrain` szintén a `Train` leszármazottja legyen. tehervonat létrehozásakor csak egy dolog fontos: a vagonok száma. 
A vonattal utazó szükséges kisérőszemélyzetet pedig úgy kell kiszámítani, hogy a vagonok számát el kell osztani 10-zel 
és lefelé kerekíteni. Olyan viszont nem lehetséges, hogy senki nem utazik kisérő személyzetként a vonattal, legalább 1 embernek 
mindeképpen mennie kell (ilyen esetben a metódus 1-et adjon vissza).

A `RailwayStation` osztály egy listában tartja nyilván az éppen bent álló vonatokat. Viszont a befogadó kapacitása véges, 
ezért csak akkor jöhet be az állomásra új vonat, ha a bent állók száma nem éri el a 10-et. (Vagyis csak ebben az esetben 
lehet a listához új vonatot adni.) 

### 2. rész (25 pont)

A pályaudvaron a következő lehetőségeket kell még megteremteni:

* Legyen egy `Train getLongestTrain()` metódus, amely visszaadja a bent álló vonatok közül a leghosszabbat.
* Legyen egy `int getHowManyTrainsHaveName()` metódus, amellyel megkaphatjuk, hány névvel rendelkező vonat áll az állomáson.
* Végül legyen egy `List<Train> getTrainsWithPassengersMoreThan(int number)` metódus, amely visszaadja azokat a vonatokat, 
  amelyek a megadott mennyiségnél több embert tudnak szállítani.
  