#### 1.1

Wypisz do konsoli tekst: `Witaj świecie!`

Do wypisania tekstu użyj metody: `print` lub `println` strumienia wyjściowego `System.out`

#### 1.2

Wypisz do konsoli ‘choinkę’ jak poniżej:

```
     *
    ***
   *****
  *******
 *********
***********
```

#### 1.3

Poproś użytkownika o wpisanie tekstu, następnie wypisz go w kolejnej linii:

```
Wpisz tekst: Witaj!
Wpisany tekst to: Witaj!
```

Do zaczytania tekstu użyj metody `next` klasy `Scanner`. Do konstruktora klasy `Scanner` przekaż domyślny strumień
wejściowy: `System.in`

#### 1.4

Wczytaj liczbę, następnie wypisz informację czy podana liczba jest parzysta czy nieparzysta.

```
Podaj liczbę: 88
Liczba 88 jest parzysta

Podaj liczbę: 13
Liczba 13 jest nieparzysta
```

Do wczytania liczby użyj metody `nextInt` klasy `Scanner`

#### 1.5

Wczytaj dwie liczby: dzielną i dzielnik, wypiszę informację czy można wykonać dzielenie całkowite.

```
Podaj dzielną: 88
Podaj dzielnik: 8

88 dzieli się przez 8
```

```
Podaj dzielną: 88
Podaj dzielnik: 9

88 nie dzieli się przez 9
```

#### 1.6

Wczytaj promień. Oblicz i wypisz obwód i pole koła.

```
Podaj promień: 10.5

Obwód: 65.97
Pole: 346.36
```

Dla zwiększenia dokładności obliczeń możesz wykorzystać stałą: `Math.PI`. Do wczytania liczby rzeczywistej użyj
metody `nextDouble` klasy `Scanner`
W celu ustalenia długości części dziesiętnej przy konwersji do łańcucha znaków użyj metody `printf`:

`System.out.printf("Pole: %.2f", area)`

#### 1.7

Wczytaj liczbę naturalną. Rozpoczynając od wczytanej liczby wypisz, w kolejności malejącej, wszystkie liczby do zera.

Podaj liczbę: 13

13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0

#### 1.8

Znajdź najmniejszą i największą spośród wprowadzonych liczb rzeczywistych.

```
Podaj ilość liczb: 6

Podaj liczbę nr 1: 33.2
Podaj liczbę nr 2: 11
Podaj liczbę nr 3: 89.1
Podaj liczbę nr 4: 3.567
Podaj liczbę nr 5: 66.9
Podaj liczbę nr 6: 47

Najmniejsza z podanych liczb to: 3.567
Największa z podanych liczb to: 89.1
```

#### 2.1

Utwórz klasę `Program` zawierającą metodę `main`.

Utwórz klasę `Employee` z polami składowymi: `firstname`, `lastname` oraz `age`.

#### 2.2

Do klasy `Employee` dodaj metodę `print` wypisującą na ekranie pracownika wg szablonu:

`Jan Kowalski 31`

Zweryfikuj poprawność działania metody: w metodzie `main` stwórz obiekt klasy `Employee`, ustaw wartości pól, a
następnie wypisz przy pomocy nowo powstałej metody jego zawartość.

#### 2.3

Do klasy `Employee` dodaj metodę `read`, której zadaniem jest utworzenie i zaczytanie obiektu klasy `Employee`:

```
Podaj imię:      Jan
Podaj nazwisko:  Kowalski
Podaj wiek:      31
```

Jakiego typu powinna to być metoda: instancyjna czy statyczna?

Zweryfikuj działanie metody wykorzystując wcześniej utworzoną metodę `print`.

#### 2.4

Wszystkie pola klasy `Employee` oznacz jako prywatne (`private`).

W głównym programie, bez wykorzystania metody `read`, utwórz obiekt klasy `Employee` oraz zainicjalizuj jego pola
wartościami: `Jan` `Kowalski` `31`.

Wprowadź niezbędne modyfikacje umożliwiające wykonanie powyższego zadania.

#### 2.5

Utwórz klasę `Company` posiadającą prywatne pole `employees` typu `ArrayList<Employee>`.

Do klasy `Company` dodaj metodę `add` przyjmującą jako argument obiekt klasy `Employee` i dodającą go do listy
pracowników (`employees`).

Kiedy należy zainicjalizować pole `employees`?

Jakiego typu powinna być metoda `add`: instancyjna czy statyczna?

W części głównej programu utwórz instancję klasy `Company` oraz dodaj do niej pracownika przy pomocy metody `add`.

#### 2.6

Do klasy `Company` dodaj bezargumentową metodę `printEmployees` wypisującą listę wszystkich pracowników w formacie:

```
--------------------
1  Jan Kowalski 31
2  Anna Kowalczyk 27
3  Piotr Nowak 36
--------------------
```

Jakiego typu powinna to być metoda: statyczna czy instancyjna?

W głównej części programu przetestuj działanie metody `printEmployees` wykorzystując listę przedstawioną powyżej.

#### 2.7

Rozszerz metodę `add` klasy `Company` o sprawdzenie czy pracownik o takim imieniu, nazwisku i wieku znajduje się już na
liście. W tym celu klasę `Employee` rozszerz o metodę `isEqual` przyjmującą jako argument inny obiekt klasy `Employee` i
zwracającą informację czy obiekty posiadają takie same pola (`boolean`).

Jeśli taki sam pracownik znajduje się już na liście, powininen zostać wypisany odpowiedni komunikat a pracownik nie
powinien zostać ponownie dodany.

`Pracownik o tych samych danych znajduje się już na liście!`

#### 2.8

Do klasy `Company` dodaj bezargumentową metodę `add`, która samodzielnie zaczyta a następnie doda do listy pracownika.

Metoda również nie powinna pozwalać na ponowne dodanie takiego samego pracownika.

Jakiego typu powinna to być metoda: statyczna czy instancyjna?

#### 2.9

Do klasy `Company` dodaj metodę `removeEmployee` usuwającą pracownika z listy. Jako argument metoda powinna przyjmować
numer porządkowy widoczny przed każdą osobą na liście wszystkich pracowników.

Jeśli wprowadzony został niepoprawny numer aplikacja powinna wyświetlić stosowny komunikat:

`Lista nie zawiera pracownika o podanym numerze porządkowym.`

#### 2.10

W głównej części programu utwórz następujące menu:

```
Lista operacji:

1 - wypisz listę pracowników
2 - dodaj pracownika
3 - usuń pracownika
9 - zakończ program

Podaj numer operacji:
``` 

Każda z operacji powinna zostać odpowiednio obsłużona i mieć odzwierciedlenie w stanie wcześniej utworzonego obiektu
klasy `Company`.

Po wybraniu operacji nr 3 program powinien poprosić o numer pracownika:

`Podaj numer pracownika do usunięcia:`

W przypadku podania niepoprawnego numeru powinien zostać wyświetlony odpowiedni komunikat:

`Operacja o podanym numerze nie istnieje!`

Menu powinno być wyświetlane ponownie po wykonaniu jakiejkolwiek operacji innej niż zakończenie programu, również w
przypadku wprowadzenia nieprawidłowego numeru operacji.