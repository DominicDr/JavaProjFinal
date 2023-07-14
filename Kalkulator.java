import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(">> KALKULATOR <<");

        System.out.print("Podaj pierwszą liczbę w operacji: ");
        double liczba1 = scanner.nextDouble();
        
        System.out.print("Podaj drugą liczbę w operacji: ");
        double liczba2 = scanner.nextDouble();
        
        System.out.println("Dostępne operacje:");

        System.out.println(" 1. Dodawanie\n 2. Odejmowanie\n 3. Mnożenie\n 4. Dzielenie\n 5. Potęgowanie\n 6. Procent z liczby\n 7. Pierwiastkowanie 2 lub 3 stopnia");
       
        
        System.out.print("Wybierz numer operacji która ma zostać wykonana na liczbach " + liczba1 + " oraz " + liczba2 + ":");
        int operacja = scanner.nextInt();
        
        double wynik = 0;
        
        switch (operacja) {
            case 1:
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dodawania " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                break;
            case 2:
                wynik = liczba1 - liczba2;
                System.out.println("Wynik odejmowania " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                break;
            case 3:
                wynik = liczba1 * liczba2;
                System.out.println("Wynik mnożenia " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                break;
            case 4:
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                    System.out.println("Wynik dzielenia " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            case 5:
                wynik = Math.pow(liczba1, liczba2);
                System.out.println("Wynik potęgowania " + liczba1 + " oraz " + liczba2 + " wynosi " + wynik);
                break;
            case 6:
                wynik = (liczba1 * liczba2) / 100;
                System.out.println(liczba2 + "% liczby " + liczba1 + " wynosi: " + wynik);
                break;
	    case 7:
		if (liczba2==2) {
			wynik = Math.sqrt(liczba1);
			System.out.println("Pierwiastek kwadratowy z liczby " + liczba1 + " wynosi: " + wynik);
			}
		
		else if (liczba2==3) {
			wynik = Math.cbrt(liczba1);
			System.out.println("Pierwiastek sześcienny z liczby " + liczba1 + " wynosi: " + wynik);
			}

		else {
			System.out.println("Nieprawidłowy stopień pierwiastka!");
			}
		break;
	   default:
		System.out.println("Nieprawidłowy numer operacji!");
		break;
        }
    }
}
