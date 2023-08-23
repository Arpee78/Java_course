### 1. rész (20 pont)

Készíts egy `teams.Player` nevű osztályt, melynek attribútumai a játékos neve, születési ideje, a mez száma, és a pozíciója,
ami a következő értékeket veheti fel: `GOALKEEPER, DEFENDER, MIDFIELDER, STRIKER`. Minden attribútumot konstruktorban
állíts be!

Készíts egy `teams.Team` nevű osztályt, melyben a csapat neve és a játékosok listája található. A csapat nevét konstruktorban állítsuk be. 
Legyen benne egy `boolean addPlayer(Player player)` metódus,
ami hozzáad egy játékost a listához. Ami fontos, hogy a listában legfeljebb 18 játékos lehessen. (Azért ennyi, hogy legyenek cserék is.)

Készíts egy `teams.League` nevű osztályt, melyben csapatok listája található, és ezt a listát konstruktorban kapja meg. 


### 2. rész (20 pont)

Bővítsd a `Team` osztályt egy `int countBirthBefore(LocalDate date)` metódussal, ami megszámolja, hogy hány játékos született a 
paraméterül átadott dátum előtt.

Bővítsd a `Team` osztályt egy `boolean isPlayerWithNameInTeam(String name)` metódussal, ami igazzal tér vissza, ha a csapatban 
szerepel a paraméterül kapott nevű játékos. 

Bővítsd a `League` osztályt egy `Team findTeamWithPlayer(String name)` nevű metódussal, ami visszaadja a csapatot, amiben a 
paraméterül kapott nevű játékos szerepel. Ha egyik csapatban sem szerepel, akkor térj vissza `null` referenciával. 
(Feltételezhetjük, hogy nincs két ugyanolyan nevű játékos.)







