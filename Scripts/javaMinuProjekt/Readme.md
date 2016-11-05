# Minuprojekt
Plaan on luua rakendus, mis analüüsiks "account statement" faile erinevate ühisrahastuse kontodelt (Investly, Bondora, Mintos, Twino, (Viventor)). 

Esialgu piirduks sellega, et alla tuleb laadida ning .csv formaati konverteerida failid manuaalselt. Kuid programm jätab arenguruumi ka sellele funktsioonile. Lisaks saaks tulevikus lisada juurde ka automaatse sisselogimise portaalidesse ning automaatse failide allalaadimise.

Programm peab suutma lugeda failidest andmeid ning valitud perioodi lõikes näitama statistikat:
>1. Received principal
2. Received interest
3. Fees paid
4. Outgoing principal (new investments)
5. Deposits to account
6. Withrawals from account

Samuti peaks näitama andmeid:
>1. Total payments to be received (Account Value)
2. Total principal to be received
3. Total interest to be received

# Miks
Ühisrahastuste enda portaalid ei ole väga paindlikud ning annavad kahtlase väärtusega/painutatud statistikat. Taoline fail on endal küll excelis olemas, mis koostab bilanssi ning võimaldab andmete põhjal statistikat teha. Kasutajasõbralikkuse, õppimise ja pikemas perspektiivis finantsi haldamise mõttes oleks kindlasti kasulik arendada välja rakendus, mis ei nõua manuaalseid liigutusi ja haldust. Samuti peab nii eraisikuna kui ka OÜna intressitulusid deklareerima MTAs ning programm võimaldaks selle protseduuri lihtsustamist. Antud rakendus võiks leida kasutust ka laiema avalikkuse käes. Ühisrahastus on hetkel üsna kuum teema.

# Mida programm teeb, kuidas töötama hakkab
>1. Loeb erinevaid .csv faile
2. Salvestab failia arrayna
3. Vastavalt kasutaja valitud funktsioonile ja muutujatele kuvab andmeid/kokkuvõtet arraydest
4. Tuleks luua lihtne UI, kus oleks valikud funktsioonidest (mida programm arvutama peab) ja userinput lahtrid muutujatele (periood)

# Eeltöö
>1. Vaja leida sarnasused .csv failides, et teha võiamlikult lihtsad funktsioonid.
2. Exceli prototüüp eelnevalt lõpule viia ning selle järgi probleem Java's lahendada.
