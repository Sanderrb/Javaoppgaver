import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Valuta dollar = new Valuta("dollar", 10.74);
        Valuta euro = new Valuta("euro", 12);
        Valuta svenske = new Valuta("svenske", 0.97);


        while (true) {
            System.out.println("\nVelg valuta: \n1: Dollar \n2: Euro \n3: Svenske Kroner \n4: Avslutt");
            int valutaValg = scanner.nextInt();

            if (valutaValg == 4) {
                System.out.println("\nDu har avsluttet");
                break;
            }

            System.out.println("Skriv beløp som omgjøres til Norske Kroner: ");
            double norskeKr = scanner.nextDouble();

            switch (valutaValg) {
                case 1:
                    dollar.konvertering(norskeKr);
                    break;
                case 2:
                    euro.konvertering(norskeKr);
                    break;
                case 3:
                    svenske.konvertering(norskeKr);
                    break;
                default:
                    System.out.println("Ugyldig valg");

            }
        }

        scanner.close();
    }
}


