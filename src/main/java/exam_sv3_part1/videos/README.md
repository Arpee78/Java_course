### 1. rész (20 pont)
Készíts egy `videos.Video` nevű osztályt, melynek attribútumai a videó címe, a feltöltés dátuma, a videó hossza (percben), a videó típusa (`Type`), 
illetve megtekintések száma. A típus egy enum, és a következő értékekkel rendelkezhet: `MUSIC, DOCUMENTARY, INTERVIEW, VLOG`. A videó létrehozásakor
a megtekintések kivételével minden attribútumot konstruktorban állítsunk be a kapott értékekre, a megtekintések száma kezdetben 0. Legyenek az attribútumokhoz
getter metódusok és egy `void watchVideo()` metódus, ami a megtekintések számát növeli.

Készíts egy `videos.User` nevű osztályt, ő a videók feltöltője. Legyen egy felhasználóneve és a videóinak a listája, melyek közül a felhasználónevet
kapja konstruktorban, a lista kezdetben üres.  

Legyen egy `void uploadVideo(Video video)` metódusa, amivel videót lehet hozzáadni a listához, illetve getter metódusok.  

Készíts egy `videos.StreamingPlatform` nevű osztályt, aminek atribútuma a `User`-ek listája, mely kezdetben üres. Legyen egy `void addUser(User user)` metódusa,
amivel felhasználót lehet hozzáadni a listához, illetve getter metódusok. 

### 2. rész (20 pont)

Bővítsd a `User` osztályt egy `int countVideosByType(Type type)` metódussal, ami visszaadja, hogy a felhasználónak hány videója van a
paraméterül kapott típusból.<br>

Bővítsd a `User` osztályt egy `int sumOfViews()` metódussal, ami kiszámolja a felhasználó videóinak össznézettségét.

Bővítsd a `StreamingPlatform` osztályt egy `int findMaxViews()` metódussal, ami visszaadja a legnagyobb nézettségű felhasználó össznézettségi adatát. 
A metódushoz használd fel az előbb megírt `sumOfViews()` metódust!