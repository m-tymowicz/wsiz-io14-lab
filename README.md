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