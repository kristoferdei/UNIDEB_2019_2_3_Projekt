# GameOver: Funkcionálisspecifikáció

### Tartalomjegyzék

- [Hogyan állunk jelenleg?]()
- [A felhasználók álma]()
- [Befolyásoló tényezők]()
- [Látványterv]()
- [A program futása]()
- [Megvalósítható?]()
- [Követelménylista]()

## I. Hogyan állunk jelenleg?

Jelenleg a felhasználók rendelkezésére áll rengeteg lehetőség, amennyiben
számítógépes játékot keresnek szabadidejük eltöltésére. A [Microsoft Store](https://www.microsoft.com/en-us/store/b/home)-ban
elérhető, egy bizonyos [The Games Database](https://www.microsoft.com/en-us/p/the-games-database/9nblggh6jhl9?activetab=pivot:overviewtab),   valamint elérhető számos weboldal az interneten, ahol hasonló tartalmak
érhetőek el. Azonban ezeknek egyike se lenne fogható az általunk elképzelt
szoftverhez, sokkal nagyobb és frissebb adatbázist szeretnénk a felhasználóknak
biztosítani, sokkal szabadabb és rugalmasabb keresést, ajánlásokat tenni nekik.
A jelenleg elérhető ilyen programok nagyrésze pedig online, az interneten
található. Valamint a jelnleg elérhető alternatívák közül egyik sem kínálja
a játékok értékelésének, esetleg későbbre történő elmentésük lehetőségét.
Nem biztosítják ügyfeleik számára a privát teret, azaz nincs bejelentkezés,
nincsenek személyre szabott ajánlások sem a böngészés tekintetébe. Ezért
van szükség egy olyan alkalmazásra, amellyel a felhasználó személyes
érdeklődési körének megfelelően kereshet játékokat, valamint a szoftver is
ajánl neki ilyeneket.

## II. A felhasználók álma

Ami az elsődleges és a legfontosabb az az, hogy **mindenki számára elérhető** legyen. Emiatt és egyébként is nagyon nehéz megfelelni a *felhasználók elvárásai*nak. Főleg, ha ilyen széles réteg felé nyitunk. Elengedhetetlen, hogy a felhasználóink saját profilt készíthessenek maguknak. Emiatt szükségünk van a **regisztrációra**. Amihez csak a szükségek adatokat kérjük be, megkímélve a felhasználókat sok felesleges információ megadásától. Persze opcionálisan lesz erre lehetőség és a későbbiekben minden módosítható. A jelszó természetesen még bejelentkezés előtt módosítható lesz, ha netalántán valaki elfelejtené. A **bejelentkező felület** megalkotásánál is törekedni kell az *egyszerűség*re és a *gyorsaság*ra. Ahogy nyilvánvalóan az egész program futása során fontos szempontot jelent számunkra. Mivel célul tűztük ki azt, hogy széles körben használatos szoftvert készítsünk, ezért meg kell engednünk a **vendég felhasználó**ként való belépést is. Ha valaki bármilyen okból kifolyólag nem szeretne regisztrálni. Ez persze számos hátránnyal, illetve *korlátozás*sal jár (nem tud a felhasználó kommentelni, értékelni..). Illetve mivel így nem tudjuk tárolni az adatait, minden egyes látogatásnál új felhasználóként van értelmezve, emiatt az ajánlások sem működhetnek. Az **ajánlások** nagyon fontos részét képzik a leendő programunknak. Ami azt jelenti, hogy előkelő helyet fog kapni a főképernyőn a bejelentkezés után. *Naponta 3 különböző ajánlat*ot fogunk közzétenni a felhasználóknak. Ezek a lehetőségek szerint minél jobban próbálják majd *kitalálni mindegy egyes felhasználó vágyait*. Azonban ha ez mégsem sikerül valamilyen ok miatt, akkor lehet őket mellőzni is. Ha viszont tetszik, akkor minden további nélkül megtekinthetőek lesznek a további részletek az adott játékról. Ezen kívül a **főoldal** fontos eleme kell, hogy legyen a **böngészés**, illetve a **keresés** funkciója is. A keresési kulcsszavak lehető *legszélesebb skáláját* fogjuk nyújtani a felhasználóknak. Lehet majd keresni *címre, kiadóra, témára*, de akár *megjelenési dátumra* is (plusz amire igény merül fel a későbbiekben). Mindemelett ami talán a leginkább fontos a programunkban, az a **játékok adatlapja**. Hiszen ez alkotja úgymond a *gerincet*. Itt fel lesz tüntetve a *cím, a borító, a megjelenés dátuma, a kiadó, a platformok, egy rövid kedvcsináló leírás, linkelve az előzetes, az ár*. A felhasználók **értékelhetik** az adott játékot egy egytől ötig terjedő skálán, csillagozós rendszerben. Lehetőségük lesz **kommentelni**, megosztani a saját véleményüket. Illetve a ma népszerű social oldalakra való *megosztás*ra és természetesen *elmenthetik* őket kivánságlistára vagy későbbi megtekintésre. Ami szintén vágyálom cél, az az, hogy a felhasználók új játékokat is be tudjak vinni a rendszerbe, ha az valamiért nem szerepelne még az adatbázisban. Ez persze moderálás után kerülne be, ha azt válósnak vagy megfelelőnek találtuk. Lényeges számunkra, hogy a felhasználók a legnagyobb *biztonság*ban tudják majd a saját adataikat. Ezért a jelszavakat titkosítva szeretnénk tárolni, illetve semmilyen egyéb adat sem lesz felhasználva semmilyen egyéb célra sem. Megfelelve ezzel minden mai elvárásnak. Ami a **felhasználói felület**et illeti, szintén törekedni szeretnénk a jelen elvárások kielégítésére. Épp ezért kell *intuitívnak* és *minimalistának* lennie. A felhasználó minél könyedebben tudjon navigálni. Egyszerű, *kényelmes* és *gördülékeny *futást szeretnénk megvalósítani. *Minél szebb* és *letisztultabb* környezetet adva, hogy öröm legyen a használata és ne szenvedés. Természetesen a program elkészülését követően semmiképp sem szeretnénk a saját sorsára hagyni. Folyamatos fejlesztéseket és javításokat fogunk alkalmazni a továbbiakban is. És új funkciók bevezetését szintén tervezzük. Amiben nagyon fontosak a felhasználók *visszajelzés*ei, ezért ezekre különösen figyelni fogunk, illetve lehetőséget biztosítani a feedbackre. Szintén szerepel a jövőbeli terveink között, hogy később az alkalmazás felkerüljön az internetre és egy bárki számára bármikor elérhető online szolgáltatás legyen belőle.

## III. Befolyásoló tényezők

A mai világban ha szeretnénk tartalmas, szórakoztató és mégis jellemépítő játékkal játszani,
elég nehéz dolgod lesz találni egyet. A probléma ott kezdődik, hogy minden játékfejlesztő cégnek
saját launcher-je van, ami szándékosan az általa fejlesztett játékokat helyezi előtérbe.
Ilymódon nehézkesen lehet egy tiszta képet kapni a ténylegesen elképesztő, kihagyhatatlan
játékokról. Az új játékok kiválasztását a szóbeszéd, baráti ajánlások és a reklámok
befolyásolják. Más szóval az ember nem ismeri meg a kis cégek által kevésbé promóciózott
termékeket. Ahhoz, hogy megtaláld az igazán nagyszerű játékélményt nyújtó szoftvereket, sok
energiát és időt kell ráfordítani a keresésre, az információk összegyűjtésére. Szintén sok
időt emészt fel a haszontalan és nem testhezálló játékok kipróbálása. Célunk egy olyan szoftver, ami összegyűjti egy helyre az információkat, megadott szempontok alapján ajánlásokat
ad, ezzel segítve, hogy a felhasználó tudámásra jusson az elvárásainak megfelelő és a stílusához
illő élményt nyújtó játék. A szoftver két legfontosabb tényezője a naprakészség és a
közösség általi értékelés. A naprakészség itt azt jelenti, hogy a játékok adatbázisa ha nem
is naponta de legalább hetente frissül a fejlesztők által vagy a felhasználói közösség is
adhat hozzá játékot értelemszerűen a moderálás után. A programot tervezzük firssíteni
legalább egyszer egy évben a felhasználói visszajelzések alapján. Alternatív felhasználási lehetőség,
hogy a szülők, akik nem szeretnék, hogy gyerekük agyzsibbasztó, értelmetlen, zombi játékokkal
játszanak, itt kitudják választani a megfelelő személyiség építő játékokat gyermekeik számára
az értékelések alapján.

## IV. Látványterv

A programablak neve az alkalmazás elindításakor: Bejelentkezés. A program **sikeres** indítása után a bejelentkező 
képernyő fog megjelenni. A bejelentkező képernyőnek a felső részének a középénél
lehet majd látni magának az alkalmazásnak a nevét kiírva, tehát a Game Over vagy
pedig az alkalmazásnak megfelelő szöveg fog látszani. A szöveghez képest lennébb 
tudja majd a felhasználó megadni a bejelentkezési adatait (Felhasználónév - Text Area,
Jelszó - Text Area), mind ezek egymás mellett elhelyezve. Ha elfelejtettük volna a belépéshez szükséges 
adatainkat, akkor az **Elfelejtetted a jelszavad?**-ra kattintva módosítást biztosító ablak ugrik fel. A belépést biztosító rész alatt
lesznek láthatóak a **navigáló gombok**. Elöszőr a bejelentkezést biztosító gomb, "**Bejelentkezés**"
felirattal, alatta, ha nem szeretnénk kitölteni a bejelentkezéshez szükséges mezőket,
akkor, "**Bejelentkezés vendégként**" feliratú gomb biztosítja a programba való belépést, illetve
jobb alsó sarokban a "**Regisztrálj**" gomb helyezkedik el. Ha a felhasználó még új és szeretne
regisztrálni, akkor az annak megfelelő gombot megnyomva tudja elérni a regisztrációi felületet.
A regisztráció felületen, a bejelentkező oldalhoz hasonlóan, középen felül lesz megjelenítve
egy "**Regisztráció**" szöveg. Alatta lehet megadni a felhasználónevet és a hozzátartozó jelszót,
illetve, hogy biztosra mennyünk, egy "**Jelszó megerősítése**" résznél újból le kell írnia a
felhasználónak az imént beírt jelszavát, hogy megegyezik-e. Ha nem egyezik meg, akkor egy "warning"
ablak felugrik ami egy szöveget: "_A két jelszó nem egyezik meg!_" és egy "**Vissza**" feliratú gomb,
ami vissza visz a regisztrációi felülethez. Ha minden remekül ment, akkor a "**Regisztrálok**" 
szöveggel ellátott gombbal tudunk feliratkozni ami egy felugró ablakot eredémnyez amin
a "_Sikeres regisztráció!_" felirat látható lehetőség szerint zöld színnel és egy gomb, ami
vissza visz a bejelentkezési képernyőre, "**Bejelentkezés**" felirattal. Amennyiben, ha
elfelejtettük volna a megadott jelszónkat és mindenféle képpen beszeretnénk lépni a már
regisztrált profilunkkal, akkor az "**Elfeletetted a jelszavad?**" gombot megnyomva megjelenik, az
erre a célra megvalósított felület. Itt az eddigiekhez hasonlóan középen felül lesz az ablak
címe: "**Új jelszó**" és alatta adható meg az új adat, és egy gomb "**Mentés**" felirattal
ami elmenti az új adatot és vissza visz egyúttal a bejelentkezési képernyőre. Amennyiben a felhasználó
bejelentkezéssel lépett be, úgy az adott felhasználó által kedvelt témájú játékok címei (3 db)
jelenik meg ajánlásként. Annak az eldöntésére, hogy az ajánlott játék tetszik-e a felhasználónak, erre gombok állnak a rendelkezésére
középen alul egymás mellett: _Megnézem később, Kipróbálom/Tetszett és az hogy Nem tetszett_. Miután 
megfelelően jelezte a felhasználó, hogy mit szeretne tenni az ajánlott játékokkal, 
az alkalmazás fő ablaka megjelenik. Egy baloldalt elhelyezett menüvel tud majd a felhasználó
navigálni a további lehetőségei közül például: _Új játék hozzáadása, Kilépés, Főaoldal, Könyvtár_. A keresési
lehetőség jobb oldalt felül lesz és mellette egy "**Keresés**" feliratú gomb van ami elindítja
a keresést. Megfelelő találat után a képernyő közepén felsorolva megjelenik/megjelennek a játék(ok).
Ha a felhasználó valamelyik keresettre rákattint akkor további, bővebb információk jelennek meg
róla. Ezen a felületen balul egy borítókép látszódik a játékról és a kép jobboldalán 
jelennek meg az információk róla, például a _kiadója, kiadási dátuma, témája, leírás a játékkal kapcsolatban_. 
Ugyan ezen a felületen alul van lehetőség az értékeléshez például egy egytől ötig terjedő skálán, csillagokkal
szemléltetve. Lehetőséget biztosítunk a felhasználónak, hogy megtekintse az
adott játéknak az előzetesét egy "**Trailer**" feliratú gombbal vagy helyette egy _link_ lesz látható.
Ha a felhasználót meggyőzte a játék akkor elmentheti a könyvtárába egy gomb nyomással, ennek a gombnak a neve "**Mentés a könyvtárba**" lenne.
Jobb alul egy gomb biztosítja a visszalépést további játékok kereséséhez (tehát vissza visz a főoldalra) 
"**Vissza a főoldalra**" felirattal. Ha a menü sorban a felhasználó a könyvtárra kattint, akkor az adott felhasználó
könyvtárának a felülete fog megjelenni. Az ablak címe itt is középen felül lesz látható, "**Játékaim**" felirattal.
Ezen a felületen lesznek majd láthatóak azok a játékok amiket a felhasználó "elmentett", illetve egy olyan gomb ami vissza visz
a főoldalra. Ha a főoldalon a menü sorban lesz a kilépést biztosító "**Kilépés**" feliratú gomb, ami az alkalmazás
bezáródását vonja maga után.Ha csak kijelentkezni szeretnénk, akkor a **Kijelentkezés** gombra kell kattintani, ami szintén a 
főoldalnak a menüsorjaiban lesz elérhető. A főoldal menüsorjában szereplő gombok előtt egy jelképes motívum látható.
Mindig amikor egy gombot használ a felhasználó, akkor megváltozik a gomb háttere, majd vissza az eredetire.

## V. A program futása

A program indulásakor lehetőséget kívánunk biztosítani a felhasználónak
vendégként történő belépésre vagy bejelentkezésre. Bejelentkezés esetén
a 3 darab játék jelenik meg az ügyfélnek, amelyeket az alapján válogat 
össze a szoftver, mely témájú játékokra kattintott a legtöbbször eddig.
Itt eldöntheti, hogy érdekli-e valamelyik. Amennyiben van ilyen a felsoroltak
között, azt elmentheti *"megnézem később"*  vagy *"kipróbálom"* mappájába,
ahol később bármikor elérheti, esetleg törölheti is azokat. Biztosítani
kívánunk a felhasználó számára egy *tetszett*, *nem tetszett* gyűjtőt is,
ahová gyűjthetik az általuk kedvelt és kevésbé kedvelt játékokat. A navigációt
egy menüvel kívánjuk megoldani, amelyen szerepelne a kijelentkezés lehetősége is,
amennyiben be szeretnénk fejezni a tevékenykedést az adott felhasználón.
Az egyik menüpont lehetőséget kínálna arra, hogy új játékot adjon hozzá
valaki, amelyet később a rendszergazda ellenőrizne, és amennyiben semmi
probléma nincs a felvett programmal, az be is kerülne a rendszerbe azzonnal.
Lenne egy keresési felület is, ahol a játékosok a számukra megfelelő játékokat
keresheti bizonyos szűrőfeltételek megadásával. Lehetőség lenne továbba
az egyes játkok értékelésére. A nagyobb értékelésű játékok előbb jelennének
meg a szűrés eredményében. Egy játék kiválasztása után bővebb információk
jelennének meg róla, mint például: kiadás dátuma, rövid leírása, értékelések,
teljes cím, egy poszter, valamint egy gomb amely elviszi a felhasználót a
játék előzeteséhez, vagy maga az előzetes fog megjelenni az alkalmazásban.

## VI. Megvalósítható?

A projekt megvalósításához az alapvető szoftverfejlesztői eszközökre van szükség. A feladatok
követésére egy online feladatkövető rendszert használunk, a Trellot. Ez az oldal tökéletesen
alkalmazható a teendők egyeztetésére, feladatok felosztására. Ez úgy történik, hogy fejlesztői
állomásokra bontjuk a projektet és kártyákkal jelezzük, hogy ki melyik feladatot készíti el.
A kártyákhoz lehet és kell is időkorlátot társítani. A szoftver menedzseléséhez az Apache
Mavent használjuk. Adatbázisokra is szükség van a felhasználók nevének és jelszavának és a
játékok adatainak tárolásához. Ehhez JSON fájlokat fogunk használni. A program maga Java
nyelven fog íródni. A grafikus felülethez viszont JavaFX-et fogunk használni. Verziókezelőnek
a git-et alkalmazzuk.

## VII. Követelménylista

### Kulcsfontosságú követelmények:

- A felhasználó be és kijelentkezésének lehetősége
- A felhasználó regisztrációjának a lehetősége
- A jelszó megváltoztatásának a lehetősége
- Főoldal felület létrehozása
- Adatlap felület létrehozása
- Kijelentkezés lehetősége

### Nem kulcsfontoságú követelmények: 

- Könyvtár felület létrehozása
- Játék ajánló
- Játék értékelés

### Képernyőkép tervek

- Bejelentkezés
- Regisztráció
- Új jelszó
- Főoldal
- Játék adatlap