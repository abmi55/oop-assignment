Jag ska skapa ett textspel där spelaren kan strida mot olika monster och spelaren(Hero) ska kunna höjas upp i level och ska kunna nå level 10.

### Character package
### Character klassen 
- Abstrakt klassen och grunden för alla karaktärer
- Innehåller namn, level, HP, XP
- Har en abstrakt attack metod som ska implementeras i subklasser

### Hero klassen
- Spelarens karaktär och ärver från character
- Har ett vapen och ett level system och kan få XP

### Monster klassen 
- Ärver från Character
- innehåller en specialattack metod

### Goblin och Boss klassen
- Goblin har en vanlig attack 
- Boss har en vanlig attack och 30% chans för special attack 

### Weapon package
### Weapon klassen
- Vapen som hjälten ska ha

### GameEngine package
### Battle system klassen
- Turbaserat system där hjälten attackerar först
- Fortsätter tills någon når 0 HP

### Encounter system klassen
- 70% chans för monster
- 10% chans för boss 
- 20% chans för säker plats

### GameEngine klassen
- Starta spelet och initiera alla system
- Hantera omstart

### MenuManager klassen
- Spelets meny

### HeroStatus klassen
- Hero Status 
