## Vizsga 1. rész (30 pont)
A következő osztályokat az `exams` comagba készítsd el.<br>

Készíts egy `ExamResult` nevű enumot a következő értékekkel: `PASSED,NOT_PASSED,OK,PERFECT`. <br>

Készítsd el az `Exam` nevű osztályt, úgy, hogy ne lehessen azt példányosítani! 
Minden vizsgának legyen egy `long studentId`, `String topic` és egy `int maxPoints`.
nevű attribútuma. Az osztálynak két konstruktora van, az egyikben minden értéket be lehet állítani, 
a másik csak egy azonosítót és egy témát kap. Ezeken kívül még legyen egy `ExamResult examResult`
 nevű attribútuma. Ezt nem konstruktorban állítjuk be, hanem a következő metódus és setter segítségével.<br>
Legyen továbbá egy `void calculateExamResult(int actualPoints)` nevű metódusa, aminek nincsen törzse. 
Majd a különböző megvalósításoknál figyeljünk arra, hogy a paraméter 0 és maxpont között legyen!<br>

Készítsd el a `MultipleChoiceExam` (feleletválasztós vizsga) osztályt, mely a vizsgából származik. 
Ezen vizsgákban a konstruktorok úgy működnek mint a szülő osztályban.<br>
A vizsgának két kimenete lehet `PASSED` vagy `NOT_PASSED`, vagyis átment vagy nem ment át. A határ 51 százalék! 
Ennek alapján állítsd be az`examResult` attribútumot.<br>

Készíts egy `PracticeExam` (gyakorlati vizsga) osztályt, mely szintén a vizsgából származik. Itt nem kapjuk 
meg a maximumpontot, helyette egy egész számokból
álló listát kapunk a konstruktorban, ami megmondja, hogy feladatonként hány pontot lehetett elérni. 
Ennek segítségével állítsuk be a maximum pontszámot a konstruktorban,
de figyeljünk arra, hogy ebben az esetben a maximumpont 10 és 150 között kell, hogy legyen.<br>
A gyakorlati vizsgánál az eredmény háromféle lehet: `NOT_PASSED,OK,PERFECT` vagyis, nem ment át, 
oké, vagy tökéletes. A százalék határok
51 és 76 százalék. Ennek alapján állítsd be az`examResult` attribútumot. <br>

Készítsd el az `ExamDB` osztályt, ami a vizsgákat tárolja egy listában. Itt legyen egy olyan metódus, 
amivel vizsgát lehet hozzáadni a listához. Ez kapjon egy vizsgát és egy aktuális pontszámot. Először 
számítsuk ki a vizsga eredményét, majd adjuk hozzá a listához. Valamint legyen getter amivel visszaadjuk a lista másolatát!


### Vizsga 2. rész (24 pont)
Egészítsd ki a `ExamDB` osztályt a kövtekező metódusokkal:

* Számold meg, hogy hány darab átment vizsga van a vizsgák között! (`int countPassedExams()`)
* Válogasd ki egy ember azonosítója alapján az összes vizsgáját! (`List<Exam> findById(long studentId)`)
* Szűrd le azokat a listákat amiknek a témája a paraméterül kapott szórészlettel kezdődik! 
  Csak a témakörök nevét add vissza és mindegyik egyszer szerepeljen(`List<String> findTopicByPrefix(String prefix)`)

 
