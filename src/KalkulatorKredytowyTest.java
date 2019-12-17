import java.math.BigDecimal;
import java.util.Scanner;

public class KalkulatorKredytowyTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Podaj metraż nieruchomości
        System.out.println("Podaj metraż nieruchomości w m2:");
        BigDecimal metrazNieruchomosci = input.nextBigDecimal();

        //Podaj cenę metra kwadratowego nieruchomości:
        System.out.println("Podaj cenę metra kwadratowego nieruchomości w zł:");
        BigDecimal cenaMetraKwadratowegoNieruchomosci = input.nextBigDecimal();

        //Oblicz wartość nieruchomości
        BigDecimal wartośćNieruchomości = metrazNieruchomosci.multiply(cenaMetraKwadratowegoNieruchomosci);
        //Wyświetl wartość nieruchomości
        System.out.printf("Wartość nieruchomości wynosi: %,.2fzł\n", wartośćNieruchomości);


    }
}
