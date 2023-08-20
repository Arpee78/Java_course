### 1. rész

Készítsd el a `cars.Car` osztályt. Minden autónak van egy márkája (szöveg), egy motormérete (lebegőpontos szám),
egy színe (felsorolásos típus, a következő felsorolókkal: `RED,BLACK,BLUE,GREY`) és egy ára (egész szám).

Az osztályban legyen egy konstruktor, ami beállítja az attribútumok kezdőértékeit, illetve getterek.

Ha egy autót nem sikerül eladni, akkor dönthetnek úgy, hogy csökkentik az árát egy bizonyos százalékkal. Ezt valósítsa meg
a `void decreasePrice(int percent)` metódus. Figyelj arra, hogy az ár a csökkentés után is egész szám legyen méghozzá a kiszámított ár egészrésze.

Készítsd el a `cars.CarShop` osztályt. Az osztálynak három attribútuma az autókereskedés neve (szöveg), egy ár, ami azt jelöli, hogy legfeljebb mekkora értékű autókkal kereskedik (egész szám), és autók listája.
A kereskedés nevét és a felső limitet konstruktorban állítsd be, a lista kezdetben legyen üres.
Minden attribútumhoz tartozzon getter metódus. 

Legyen az osztályban egy `boolean addCar(Car car)` metódus, ami a paraméterül kapott autót hozzáadja a listához és
igazat ad vissza, ha az autó ára nem haladja meg a max limitet. Ellenkező esetben ne kerüljön a kocsi a listába és hamis értékkel térjen vissza.

### 2. Rész

Bővitsd a `CarShop` osztályt egy metódussal, ami visszaadja a kereskedésben található autók összértékét.
A metódus neve legyen `int sumCarPrice()`.

Legyen egy metódus, ami vár egy árat és visszaadja a kapott árnál nem drágább autók darabszámát.
A metódus neve legyen `int numberOfCarsCheaperThan(int price)`.

Legyen egy metódus, ami paraméterül vár egy márkát és visszaadja az összes olyan márkájú autót. 
A metódus neve legyen `List<Car> carsWithBrand(String brand)`. 
