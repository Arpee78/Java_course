### 1. rész (20 pont)

Készíts egy `cookbook.Recipe` nevű osztályt, melynek attribútumai a recept neve, a nehézsége ami a következő értékeket
veheti fel : `EASY,MEDIUM,HARD`, a hozzávalók szövegként egy listában, és a leírás. Minden attribútumot konstruktorban
állíts be. Legyen benne még egy `boolean containsIngredient(String ingredient)` metódus, ami igazzal tér vissza, ha a recept 
tartalmazza a hozzávalót, különben hamissal. 

Készíts egy `cookbook.CookBook` nevű osztályt, amiben egy kezdetben üres receptek lista található. Legyen benne egy
`boolean addRecipe(Recipe recipe)` metódus, ami egy receptet hozzáaad a listához. Egy feltétel van, ha a recept `EASY`
vagy `MEDIUM`
akkor legfeljebb 10 hozzávalója lehet! Ha ez nem teljesül ne adjuk hozzá a receptet a listához és `false` értékkel
térjünk vissza.

### 2. rész (20 pont)

Bővítsd a `CookBook` osztályt egy `boolean isRecipeInCookbookWithDifficulty(Difficulty difficulty)` metódussal, ami igazzal tér vissza,
ha a szakácskönyvben van a paraméterül átadott nehézségű recept. Ha nincs akkor hamissal. 

Bővítsd a `CookBook` osztályt egy `int findNumberOfMaxIngredients()` metódussal, ami visszaadja a legtöbb hozzávalóval rendelkező
recept hozzávalóinak számát. Ha nincs recept a listában akkor 0-t, ha több recept is van ugyanazzal a maximumértékkel akkor az első találatot. 

Bővítsd a `CookBook` osztályt egy `int countRecipeWithIngredient(String ingredient)` metódussal, ami megszámolja, hogy hány olyan recept van,
ami tartalmazza a paraméterül átadott hozzávalót! Használd a fentebb megírt `containsIngredient()` metódust. 








