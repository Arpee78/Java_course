Adott egy file, a `test/resources/input.csv`, melyben termékek cikkszáma (id) és ára található. Van olyan sor, ahol harmadik 
értékként szerepel az eddig eladott termékek darabszáma. Olvasd be a fájl tartalmát a memóriába, de figyelj, hogy
terméket kétféleképpen lehet létrehozni: úgy, hogy van hozzá darabszám, vagy úgy, hogy nincs. Ebben az esetben a darabszám 0. 
A beolvasás után állapítsd, meg hogy melyik termék hozta a legnagyobb hasznot! Ha beolvasás előtt vizsgálódnánk, 
akkor dobj `IllegalStateException`-t!