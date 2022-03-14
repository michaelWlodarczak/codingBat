package string1;

/*
Zadanie 2. Napisz metodę, która zwróci środkowy znak z tekstu podanego jako argument.
Jeśli ciąg znaków jest parzysty - metoda powinna zwrócić dwa znaki.
Program powinien wyświetlić wynik na ekran.
Do wykonania zadania proszę użyć zmiennej typu String i na niej wykonywać operacje.
Przykład: Gdy zmienna z tekstem ma wartość "12345" program powinien wyświetlić "3".
Po przypisaniu do zmiennej "Adam" program powinien wyświetlić "da"
 */

public class MiddleInterview {
    public static void main(String[] args) {

//        String str = "12345";
        String str = "Adam";


        int half = str.length() / 2;


        if (str.length() % 2 == 0) {
            System.out.println(str.substring(half - 1, half + 1));
        } else if (str.length() % 2 != 0)
            System.out.println(str.substring(half, half + 1));


    }
}

